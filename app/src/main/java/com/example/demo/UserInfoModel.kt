package com.example.demo

/**
 * Created by tanqing.cc
 * on 2021/7/4
 */

class UserInfoModel(name: String, age: Int, address: String) {
    private var name: String
    private var age: Int
    private var address: String
    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getAge(): Int {
        return age
    }

    fun setAge(age: Int) {
        this.age = age
    }

    fun getAddress(): String {
        return address
    }

    fun setAddress(address: String) {
        this.address = address
    }

    init {
        this.name = name
        this.age = age
        this.address = address
    }
}