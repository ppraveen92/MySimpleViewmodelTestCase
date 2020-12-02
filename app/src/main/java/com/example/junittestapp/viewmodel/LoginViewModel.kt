package com.example.junittestapp.viewmodel

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


open class LoginViewModel : ViewModel() {

    private val userList = listOf("prave","vimal")
    var username = MutableLiveData<String>()
    var pass = MutableLiveData<String>()
    var edittext = MutableLiveData<String>()
    var status = MutableLiveData<String>()

    fun updateUserName(v: View) {
        logUser(username.value.toString(), pass.value.toString())
    }

    fun logUser(user: String, pass: String): Boolean {
        if ( user.equals("") || pass.equals(""))
            return false
        if (userList.contains(user))
        return false
        return true
    }
}