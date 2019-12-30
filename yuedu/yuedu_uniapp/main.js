import Vue from 'vue'
import App from './App'

/**
 * check login 重定向至登录页面
 * @param prePage 记录前一个页面,登录后返回
 * @param openType 跳转方式(navigateTo|redirectTo|switchTab)
*/
Vue.prototype.ctx="http://49.232.43.230:8800/";
Vue.prototype.checkLogin = function(backpage, backtype){
	var SUID  = uni.getStorageSync('SUID');
	var SRAND = uni.getStorageSync('SRAND');
	var SNAME = uni.getStorageSync('SNAME');
	var SFACE = uni.getStorageSync('SFACE');
	if(SUID == '' || SRAND == '' || SFACE == ''){
		uni.redirectTo({url:'../login/login?backpage='+backpage+'&backtype='+backtype});
		return false;
	} 
	return [SUID, SRAND, SNAME, SFACE];
}
Vue.config.productionTip = false

App.mpType = 'app'

const app = new Vue({
    ...App
})
app.$mount()
