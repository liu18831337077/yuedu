<template>
	<view>
		  <view class="wrap">
		        <view class="write_title">
		            <input type="text" v-model="title" placeholder="请输入标题" />
		        </view>
		        <!-- 内容展示区 -->
		        <view class="artList">
		            <block v-for="(item, index) in artList" :key="index" >
		                <view class="item" v-if="item.type == 'image'">
						<image :src="item.content" :data-index="index" mode="widthFix" @tap="removeImg" /></view>
		                <view class="item" v-if="item.type == 'text'">
		                    <textarea :value="item.content" placeholder="" v-model="artList[index].content" />
		                    <view :data-index="index" class="deleteText" @tap="deleteText">删除</view>
		                </view>
		            </block>
		        </view>
		        <!-- 输入区 -->
		        <form @submit="submit">
		            <view class="inputArea">
		                <view class="addImg" @tap="addImg">+图片</view>
		                <view class="addText">
		                    <textarea name="artText" maxlength="-1" v-model="inputContent" placeholder="请输入文本" />
		                    <button type="primary" form-type="submit">添加</button>
		                </view>
		            </view>
		        </form>
		        <!-- 选择分类 -->
		        <view class="art-cate">
		            <view>文章分类</view>
		            <view class="">
		               <picker @change="cateChange" bindchange="bindPickerChange" data-array="{{caties}}"
		                value="{{caties[currentCateIndex].cate_id}}" range="{{caties}}" range-key="cate_name">
		                   <view>{{caties[currentCateIndex].cate_name}}</view>
		               </picker>
		            </view>
		        </view>
		        <!-- 提交按钮 -->
		        <view class="submitNow" v-if="artList.length > 0" @tap="submitNow">编辑文章</view>
		    </view>
	</view>
</template>

<script>
	var artId, loginRes, _self;
	export default {
		data() {
			return {
				title : '',
				artList : [],
				inputContent : "",
				needUploadImg : [],
				uploadIndex : 0,
				//分类
				caties : [{"cate_id":0,"cate_pid":0,"cate_name":"请选择","cate_order":1}],
				currentCateIndex : 0,
				catiesFromApi : [],
				// 记录真实选择的api接口数据的分类id
				sedCateIndex  : 0,
				art_id:0,
				art_uid:0
			}
		},//选中分类
		methods: {
			cateChange:function(e){
				this.currentCateIndex=e.detail.value;
				this.sedCateIndex=this.caties[this.currentCateIndex].cate_id;
			},
			//删除文字
			deleteText : function(e){
				var index = e.currentTarget.dataset.index;
				uni.showModal({
					content:"确定要删除吗",
					title:'提示',
					success(e) {
						if (e.confirm) {
							_self.artList.splice(index, 1);
						}
					}
				});
			}, //添加文字
			submit : function(res){
				var content = res.detail.value.artText;
				if(content.length < 1){uni.showToast({title:"请输入内容",icon:'none'}); return ;}
				this.artList.push({"type":"text", "content" : content});
				this.inputContent = '';
			},//添加图片
			addImg : function(){
				_self=this;
				uni.chooseImage({
					count: 1,
					sizeType: ['compressed'],
					success: function(res) {
						_self.artList.push({"type":"image", "content" : res.tempFilePaths[0]})
					}
				})
			},
			submitNow:function(){
				 // 数据验证
				if(this.title.length < 2){uni.showToast({title:'请输入标题', icon:"none"}); return ;}
				if(this.artList.length < 1){uni.showToast({title:'请填写文章内容', icon:"none"}); return ;}
				if(this.sedCateIndex < 1){uni.showToast({title:'请选择分类', icon:"none"}); return ;}
				 // 上传图片 一次一个多次上传 [ 递归函数 ]
				// 上传完成后整体提交数据
				// 首先整理一下需要上传的图片
				// this.needUploadImg = [{tmpurl : 临时地址, index : 数据索引}]
				this.needUploadImg = [];
				for(var i = 0; i < this.artList.length; i++){
					//把图片保存在needUploadImg属性中
					if(this.artList[i].type == 'image'){
						this.needUploadImg.push({"tmpurl" : this.artList[i].content , "indexID" : i});
					}
				}
				this.uploadImg();
			},uploadImg : function(){
				 // 如果没有图片 或者已经上传完成 则执行提交
				if(this.needUploadImg.length < 1 || this.uploadIndex >=  this.needUploadImg.length){
					//文章提交
					uni.showLoading({title:"正在提交..."});
					// 将信息整合后提交到服务器
					uni.request({
						url: this.ctx + 'articles/updateArticle',
						method: 'POST',
						data: {
							art_id:_self.art_id,
							art_title   : _self.title,
							art_content : JSON.stringify(_self.artList),
							art_uid     : loginRes[0],
							art_cate    : _self.sedCateIndex,
						},
						success: res => {
							if(res.data.msg == 'ok'){
								uni.showToast({title:"提交成功", icon:"none"});
								_self.artList = [];
								// 清空数据, 防止数据缓存
								_self.currentCateIndex = 0;
								_self.sedCateIndex     = 0;
								_self.needUploadImg    = [];
								_self.title            = ''; 
								 uni.hideLoading();
								setTimeout(function(){
									uni.switchTab({
										url:'../my/my'
									})
								}, 1000);
							}else{
								uni.showToast({title:res.data.data, icon:"none"});
							}
						},
						fail: (res) => {
							
						},
						complete: () => {
							
						}
					});
					return ;
				}else{
					//图片提交
					uni.showLoading({title:"上传图片"});
					var uploader = uni.uploadFile({
						url      : _self.ctx+'fileUpload',
						filePath : _self.needUploadImg[_self.uploadIndex].tmpurl,
						name     : 'file',
						success: (uploadFileRes) => {
							uploadFileRes=uploadFileRes.data;
							// 将已经上传的文件地址赋值给文章数据
							var index = _self.needUploadImg[_self.uploadIndex].indexID;
							_self.artList[index].content = _self.ctx + uploadFileRes;
							_self.uploadIndex ++;
							// 递归上传
							setTimeout(function(){_self.uploadImg();}, 1000);
						},
						fail: () => {
							uni.showToast({title:"上传图片失败,请重试!", icon:"none"});
						}
					})
				}
			},
			//删除图片
			removeImg:function(e){
				var index = e.currentTarget.dataset.index;
				uni.showModal({
					content:"确定要删除吗",
					title:'提示',
					success(e) {
						if (e.confirm) {
							_self.artList.splice(index, 1);
						}
					}
				});
			}
		},
		onLoad:function(option) {
			//得到文章对象
			_self=this;
			artId=option.artId;
			loginRes = this.checkLogin('../editArt/editArt', '2');
			if(!loginRes){return false;}
			uni.request({
				url: _self.ctx + 'articles/getArticleById?id='+artId,
				method: 'GET',
				data: {},
				success: res => {
					_self.artList=JSON.parse(res.data.art_content);
					_self.title=res.data.art_title;
					//设置初始分类
					for(var i=0; i<_self.caties.length; i++){
						if(_self.caties[i].cate_id==res.data.art_cate){
							_self.currentCateIndex=i;
						}
					}
					_self.art_id=res.data.art_id;
					_self.art_uid=res.data.art_uid;
					_self.sedCateIndex=res.data.art_cate;
				}
			});
			//得到分类对象
			uni.request({
				url: this.ctx+'categories/getAll',
				method: 'GET',
				data: {},
				success: res => {
					//请求后台的数据进行赋值
					res=res.data;
					for(var i=0; i<res.length; i++){
						_self.caties.push(res[i])
					}
				},
				fail: () => {},
				complete: () => {}
				 
			})
		}
	}
</script>

<style>

</style>
