package com.example.twitterClone.ui.fragment.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.twitterclone.databinding.FragmentLoginPasswordBinding

class LoginPassword : Fragment() {

    private lateinit var loginPasswordBinding: FragmentLoginPasswordBinding
    private lateinit var usernameKey:String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        loginPasswordBinding = FragmentLoginPasswordBinding.inflate(layoutInflater,container,false)

        return loginPasswordBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        getArgumentsData()
    }

    private fun getArgumentsData(){
        val bundle = arguments
        loginPasswordBinding.etPhoneEmailUsername.setText(bundle?.get(this.usernameKey).toString())
    }

    private fun initialize() {
        this.usernameKey = "username"
    }
}