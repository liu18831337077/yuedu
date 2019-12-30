<template>
	<view>
		
	</view>
</template>
 
<script>
	export default {
		data() {
			
		},
		methods: {
			
		},
		onLoad:function(options) {
			//app 端微信登录
			// #ifdef APP-PLUS
			uni.login({
				success: (res) => {
					uni.getUserInfo({
						success: (info) => {
							this.nickName=info.userInfo.nickName;
							this.avatarUrl=info.userInfo.avatarUrl;
							
							uni.request({
								url: this.ctx+'members/wxLogin',
								method: 'POST',
								data: {
									openid :info.userInfo.openId,
									name   : info.userInfo.nickName,
									face   : info.userInfo.avatarUrl,
								},
								success: res => {
									uni.setStorageSync('SUID',res.data.data.u_id);
									uni.setStorageSync('SRAND',res.data.data.u_random);
									uni.setStorageSync('SNAME',res.data.data.u_name);
									uni.setStorageSync('SFACE',res.data.data.u_face); 
									uni.setStorageSync('loginUser',res.data.data); 
								},
								fail: () => {},
								complete: () => {}
							});
							if(options.backtype == 1){
								uni.redirectTo({url:options.backpage});
							}else{
								uni.switchTab({url:options.backpage});
							}	
						},
						fail: () => {
							uni.showToast({title:"微信登录授权失败"});
						}
					})
				},
				fail: () => {
					uni.showToast({title:"微信登录授权失败"});
				}
			})
			// #endif
			
		},
	}
</script>

<style>

</style>
