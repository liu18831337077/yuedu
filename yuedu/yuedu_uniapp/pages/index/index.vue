<template>
	<view class="content">
		 <view>
		        <view class="grace-header-cate">
		            <scroll-view class="grace-tab-title grace-center" scroll-x="true" id="grace-tab-title">
		                <view v-for="(cate, index) in categories" :key="index" :data-cateid="cate.cate_id" :data-index="index" :class="[cateCurrentIndex == index ? 'grace-tab-current' : '']" @tap="tabChange">
								{{cate.cate_name}}
						</view>
		            </scroll-view>
		        </view>
		        <view style="height:50px;"></view>
		        <!-- 文章内容区 -->
		        <view class="grace-news-list">
		            <block v-for="(item, index) in artList" :key="index">
		                <!-- 一张图 -->
		                <navigator v-if="item.art_content.length < 3" open-type="navigate" :url="'../info/info?artid='+item.art_id">
		                    <view class="grace-news-list-img-news">
		                        <view class="grace-news-list-title-main">{{item.art_title}}</view>
		                        <view class="grace-news-list-img-big"><image :src="item.art_content[0]" mode="widthFix"></image></view>
		                    </view>
		                </navigator>
		                <!-- 三张图 -->
		                <navigator v-if="item.art_content.length >= 3" :url="'../info/info?artid='+item.art_id">
		                    <view class="grace-news-list-img-news">
		                        <view class="grace-news-list-title-main">{{item.art_title}}</view>
		                        <view class="grace-news-list-imgs">
		                            <view class="imgs"><image :src="item.art_content[0]" mode="widthFix"></image></view>
		                            <view class="imgs"><image :src="item.art_content[1]" mode="widthFix"></image></view>
		                            <view class="imgs"><image :src="item.art_content[2]" mode="widthFix"></image></view>
		                        </view>
		                    </view>
		                </navigator>
		            </block>
		        </view>    
		    </view>
	</view>
</template>

<script>
	//声明this对象，当前分类id，当前页数
	var _self, cate = 0, page = 1;
	export default {
		data() {
			return {
				categories:[{cate_id : 0, cate_name : "全部"}],
				cateCurrentIndex : 0,
				artList:[],
				isLastPage : false//是否是最后一页
			}
		},
		methods: {
			//加载文章
			getNewsList : function(){
				uni.showLoading({'title':"加载中..."});
				uni.request({
					url: _self.ctx + 'articles/getArticlesByCate?art_cate='+cate+'&page='+page,
					method: 'GET',
					success: res => {
						if(_self.isLastPage == true){
							uni.showToast({
								title:"已经加载全部新闻",
								icon: "none"
							});
						}else if(_self.isLastPage == false){
							//整理新闻信息
							var newsList = res.data.data;
							for(var i = 0; i < newsList.length; i++){
								// 把图片分离出来
								var imgs = [];
								var content = newsList[i].art_content;
								content = JSON.parse(content);
								for(var ii = 0; ii < content.length; ii++){
									if(content[ii].type == 'image'){
										imgs.push(content[ii].content);
									}
								}
								newsList[i].art_content = imgs;
							}
							//填充数据
							_self.artList = _self.artList.concat(newsList);
							uni.hideLoading();
							page++;
						}
						//设置是否为最后一页
						_self.isLastPage=res.data.isLastPage;
					},
					complete:function(){
						uni.stopPullDownRefresh();
					}
				});
			},tabChange : function(e){
				var cateid = e.currentTarget.dataset.cateid;
				var index = e.currentTarget.dataset.index;
				//得到当前点击事件对象的下标和分类id，并重置页数为第一页
				page = 1;
				//分类名高亮
				this.cateCurrentIndex = index;
				//修改接口入参的分类id的值
				cate = cateid;
				//初始化页面数据
				this.artList = [];
				//调用得到文章的方法
				this.getNewsList();
				//初始化是否为最后一页
				_self.isLastPage=false;
			},
		},onLoad:function() {
			_self = this;
			// 加载文章分类
			uni.request({
				url: this.ctx+'categories/getAll',
				method: 'GET',
				data: {},
				success: res => {
					//请求后台的数据进行赋值
					res=res.data;
					for(var i=0; i<res.length; i++){
						_self.categories.push(res[i]);
					} 
				},
				fail: () => {},
				complete: () => {}
			})
							
			// 加载全部文章
			this.getNewsList();
		},onReachBottom:function(){
			//上拉加载更多
			this.getNewsList();
		},onPullDownRefresh:function(){
			//下拉刷新
			//初始化页面数据
			this.artList = [];
			//重置页码
			page = 1;
			//重置是否为最后一页的标识
			_self.isLastPage=false;
			//获取数据
			this.getNewsList();
		}
	}
</script>

<style>
</style>
