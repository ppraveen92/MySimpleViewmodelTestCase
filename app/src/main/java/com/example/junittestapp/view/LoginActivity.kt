package com.example.junittestapp.view

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.junittestapp.R
import com.example.junittestapp.databinding.ActivityLoginBinding
import com.example.junittestapp.viewmodel.LoginViewModel

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        val viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        binding.loginviewmodel = viewModel
        viewModel.status.observe(this, Observer {
            Toast.makeText(this, viewModel.status.value, Toast.LENGTH_SHORT).show()
        })
        viewModel.edittext.observe(this, Observer {
            ShowToastMessage(it.toString())
        })

    }
}
fun Activity.ShowToastMessage(s: String) {
    Toast.makeText(this, s, Toast.LENGTH_SHORT).show()
}