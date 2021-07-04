package com.example.demo

import android.os.Handler

/**
 * Created by tanqing.cc
 * on 2021/7/4
 */

class UserInfoPresenter(private val iUserInfoView: IUserInfoView) {
    fun loadUserInfo() {
        val userId: String? = iUserInfoView.loadUserId()
        iUserInfoView.showLoading() //接口请求前显示loading
        //这里模拟接口请求回调-
        Handler().postDelayed(Runnable { //模拟接口返回的json，并转换为javaBean
            val userInfoModel = UserInfoModel("小宝", 1, "杭州")
            iUserInfoView.showUserInfo(userInfoModel)
            iUserInfoView.dismissLoading()
        }, 3000)
    }

}