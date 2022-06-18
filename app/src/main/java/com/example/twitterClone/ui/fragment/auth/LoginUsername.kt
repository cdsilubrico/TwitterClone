package com.example.twitterClone.ui.fragment.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.compose.ui.graphics.Color
import androidx.core.widget.addTextChangedListener
import androidx.navigation.fragment.findNavController
import com.example.twitterclone.R
import com.example.twitterclone.databinding.FragmentLoginUsernameBinding

class LoginUsername : Fragment() {

    private lateinit var loginUsernameBinding: FragmentLoginUsernameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private fun initializeString() {
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        loginUsernameBinding =
            FragmentLoginUsernameBinding.inflate(layoutInflater, container, false)

        return loginUsernameBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onNextClick()
        validateInput()
    }

    private fun setDefaults() {
        loginUsernameBinding.btnNext.isClickable = false
    }

    private fun onNextClick() {
        loginUsernameBinding.btnNext.setOnClickListener {
            navigatePasswordScreen()
        }
    }

    private fun navigatePasswordScreen() {
        val action = LoginUsernameDirections.actionLoginToLoginPassword(getUsername())
        findNavController().navigate(action)
    }

    private fun getUsername(): String {
        return loginUsernameBinding.etPhoneEmailUsername.text.toString()
    }

    private fun validateInput() {
        loginUsernameBinding.etPhoneEmailUsername.addTextChangedListener {
            if (loginUsernameBinding.etPhoneEmailUsername.text.isNullOrEmpty()) {
                btnDisabled()
            } else {
                btnEnabled()
            }
        }
    }

    private fun btnDisabled() {
        loginUsernameBinding.btnNext.isEnabled = false
        loginUsernameBinding.btnNext.alpha = .5F
    }

    private fun btnEnabled() {
        loginUsernameBinding.btnNext.isEnabled = true
        loginUsernameBinding.btnNext.alpha = 1F
        loginUsernameBinding.btnNext.setHintTextColor(R.color.semi_dark)
    }

}