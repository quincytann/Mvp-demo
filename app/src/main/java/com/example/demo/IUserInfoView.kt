package com.example.demo

/**
 * Created by tanqing.cc
 * on 2021/7/4
 */

open interface IUserInfoView {
    fun loadUserId(): String? //假设接口请求需要一个userId
    fun showLoading() //展示加载框
    fun dismissLoading() //取消加载框展示
    fun showUserInfo(userInfoModel: UserInfoModel?) //将网络请求得到的用户信息回调
}