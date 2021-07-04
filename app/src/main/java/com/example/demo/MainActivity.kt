package com.example.demo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), IUserInfoView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val presenter = UserInfoPresenter(this)
        presenter.loadUserInfo()
    }

    override fun showLoading() {
        Toast.makeText(this, "正在加载", Toast.LENGTH_LONG).show()
    }

    override fun dismissLoading() {
        Toast.makeText(this, "加载完成", Toast.LENGTH_LONG).show()
    }

    override fun showUserInfo(userInfoModel: UserInfoModel?) {
        if (userInfoModel != null) {
            tv_name.text = userInfoModel.getName()
            tv_age.text = userInfoModel.getAge().toString()
            tv_address.text = userInfoModel.getAddress()
        }
    }

    override fun loadUserId(): String? {
        return "1000" //假设需要查询的用户信息的userId是1000
    }
}