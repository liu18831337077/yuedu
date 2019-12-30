-<template>
	  <view>
	        <!-- 标题 -->
	        <view :class="['grace-article-title', graceSkeleton == 'ing' ? 'grace-skeleton' : '']">{{article.art_title}}</view>
	        <!-- 作者信息 -->
	        <view class="grace-article-author-line">
	            <view :class="['grace-article-author', graceSkeleton == 'ing' ? 'grace-skeleton' : '']">
	                <image :src="article.u_face" mode="widthFix"></image>
	                <view class="author-name">{{article.u_name}}</view>
	            </view>
	            <view>{{article.art_createtime}}</view>
	        </view>
	        <!-- 文章内容 -->
	        <view class="grace-article-contents">
	            <block v-for="(item, index) in artContents" :key="index">
	            <view :class="['img-item', graceSkeleton == 'ing' ? 'grace-skeleton' : '']" v-if="item.type == 'image'">
	                <image :src="item.content" mode="widthFix"></image>
	            </view>
	            <view :class="['text-item', graceSkeleton == 'ing' ? 'grace-skeleton' : '']" v-if="item.type == 'text'">{{item.content}}</view>
	            </block>
	        </view>
	    </view>
</template>

<script>
	var artid,_self;
	export default {
		data() {
			return {
				article : [], //文章基础信息
				artContents : [], // 文章项目
				graceSkeleton : 'ing'
			}
		},
		methods: {
			
		},onLoad:function(option){
			artid=option.artid;
			_self = this;
			// 加载文章详情
			uni.showLoading({title:""});
			uni.request({
				url: _self.ctx + 'articles/getArticleById?id='+artid,
				method: 'GET',
				data: {},
				success: res => {
					var art = res.data;
					// 将文章内容转换成数组
					var artContentItems = JSON.parse(art.art_content);
					// 首先规划骨架
					this.artContents = []; 
					for(var i = 0; i < artContentItems.length; i++){
						this.artContents.push({'type': artContentItems[i].type});
					}
					// 延迟添加数据
					setTimeout(function(){
						_self.article       = art;
						_self.artContents   = artContentItems;
						_self.graceSkeleton = 'end';
						uni.hideLoading();
					}, 500);
				}
			});
		}
	}
</script>

<style>

</style>
