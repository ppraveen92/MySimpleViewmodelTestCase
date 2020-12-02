package com.example.junittestapp.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class LoginViewModelTest {

    @get:Rule
    var instantExecutorRule = InstantTaskExecutorRule()

    lateinit var mLoginViewModel: LoginViewModel

    @Before
    fun setUp() {
        mLoginViewModel = LoginViewModel()
    }

    @Test
    fun `test for empty case`() {
        val status = mLoginViewModel.logUser("", "")
        assertEquals(status, false)
    }

    @Test
    fun `test for already exist user`() {
        val status = mLoginViewModel.logUser("prave", "e")
        assertEquals(status, false)
    }

    @Test
    fun `test for registration case`() {
        val status = mLoginViewModel.logUser("pra", "arp")
        assertEquals(status, true)
    }
}