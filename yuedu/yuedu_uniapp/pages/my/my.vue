<template>
	<view>
		<view class="myface">
			<image :src="myFace" mode="widthFix"></image>
		</view>
		<view style="text-align:center; margin:10px 0;">
			{{user.u_name}} <text style="color: #888888;" @tap="loginOut">注销</text>
		</view>
		<view class="grace-box-banner" style="margin:10rpx 0;">
			<view class="garce-items">
				<view class="line1">{{user.artCount}}</text></view>
				<view class="line2">文章</view>
			</view>
			<view class="garce-items">
				<view class="line1">{{user.u_integral}}</text></view>
				<view class="line2">积分</view>
			</view>
			<view class="garce-items">
				<view class="line1">{{user.u_remainder}}</text></view>
				<view class="line2">余额</view>
			</view>
			<view class="garce-items">
				<view class="line1">0</text></view>
				<view class="line2">消息</view>
			</view>
		</view>
		<view class="grace-title grace-nowrap grace-space-between">
			<view class="grace-h5 grace-blod">我的文章</view>
		</view>
		<view class="myart-list" v-for="(item, index) in arts" :key="index">
			<view class="title">{{item.art_title}}</view>
			<view class="btns">
				<view :data-artid="item.art_id" @tap="editArt">编辑</view>
				<view :data-artid="item.art_id" :data-index="index" @tap="removeArt">删除</view>
			</view>
		</view>
		<view class="loadMore" >{{loadMore}}</view>
	</view>
</template>

<script>
	var loginResult;
	export default {
		data() {
			return {
					//用户
					user:{},
					//用户头像
					myFace: '',
					//用户的文章
					arts : [],
					loadMore : "上拉加载更多",
					//页数
					page:1,
					isLastPage : false
			}
		},
		methods: {
			//退出登录
			loginOut:function(){
				uni.removeStorageSync('SUID');
				uni.removeStorageSync('SRAND');
				uni.removeStorageSync('SNAME');
				uni.removeStorageSync('SFACE');
				uni.removeStorageSync('loginUser');
				 uni.showToast({
				 	title:"您已退出登录",
					icon:"none"
				 })
				 setTimeout(function(){
					 uni.switchTab({url:'../index/index'});
				 },1000)
			},getArtList:function(){
				//得到用户的文章
				var SUID  = uni.getStorageSync('SUID');
				var _self=this;
				uni.request({
					url: _self.ctx+'articles/getArticlePageByUserId?uid='+SUID+'&page='+_self.page,
					method: 'GET',
					data: {
					},
					success: res2 => {
						if(_self.isLastPage == false){
							uni.showLoading({title:"加载中..."});
				            this.arts = this.arts.concat(res2.data.data);
				            _self.page++;
							_self.isLastPage=res2.data.isLastPage;
				            this.loadMore = '上拉加载更多';
				        }else if(_self.isLastPage == true){
				            this.loadMore = '已经加载全部';
				        }else{
				            this.loadMore = '上拉加载更多';
				        }
						 uni.hideLoading();
					},
					fail: () => {},
					complete: () => {}
				});
			},updateUserInfo:function(){
				//刷新页面数据
				let loginRes = this.checkLogin('../my/my', 2)
				if (!loginRes) {return;}
				//清除缓存数据
				this.arts = [];
				this.loadMore = "上拉加载更多";
				//页数
				this.page=1;
				this.isLastPage =false;
				//更新用户数据
				var SUID  = uni.getStorageSync('SUID');
				var SRAND = uni.getStorageSync('SRAND');
				var SNAME = uni.getStorageSync('SNAME');
				var SFACE = uni.getStorageSync('SFACE');
				var _self=this;
				uni.request({
					url: _self.ctx+'members/getMembersVoById?id='+uni.getStorageSync('SUID'),
					method: 'GET',
					data: {
					},
					success: res => {
						uni.setStorageSync('loginUser',res.data); 
					},
					fail: () => {},
					complete: () => {}
				});
				var loginUser = uni.getStorageSync('loginUser');
				this.user=loginUser;
				this.myFace=SFACE;
				this.isLogin=true;
				this.getArtList();
				
			},
			removeArt : function(e){
				var _self=this;
				var artId = e.currentTarget.dataset.artid;
				var index = e.currentTarget.dataset.index;
				uni.showModal({
					title:"提示",
					content:"确定要删除吗?",
					success:function(e){
						if(e.confirm == true){
							uni.request({
								url: _self.ctx + 'articles/removeArt?artId='+artId,
								method: 'POST',
								data: {},
								success: res => {
									if(res.data.status == 'ok'){
										uni.showToast({title: "已删除", icon:"none"});
										_self.arts.splice(index, 1);
										_self.user.artCount=_self.user.artCount-1;
									}else{
										uni.showToast({title: "删除失败", icon:"none"});
									}
								}
							});
						}
					}
				});
			},editArt:function(e){
				//带着文章id跳转到修改页
				var artId = e.currentTarget.dataset.artid;
				uni.navigateTo({
					url:"../editArt/editArt?artId="+artId
				});
			},
		},onReachBottom:function(){
			this.getArtList();
		},onTabItemTap: function() {
			this.updateUserInfo();
		},onLoad: function() {
			this.updateUserInfo();
		}
	}
</script>

<style>
.myface{width:88px; height:88px; border:5px solid #F1F2F3; border-radius:100%; margin:15px auto;}
.myface image{width:100%; border-radius:100%;}
.myart-list{width:100%; margin:8px 0; overflow:hidden; border-bottom:1px dashed #D7D8D9;}
.myart-list .title{line-height:2em; width:100%;}
.myart-list .btns{line-height:2em; width:100%;}
.myart-list .btns view{float:right; padding:0 6px; margin:0 5px; color:#00B26A;}
.myart-list .btns view:last-child{color:#F76260;}
.loadMore{width:100%; height: 30px; padding:8px 0; text-align:center; color:#CCCCCC;}
</style>
