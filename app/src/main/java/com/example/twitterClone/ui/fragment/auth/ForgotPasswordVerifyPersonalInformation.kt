package com.example.twitterClone.ui.fragment.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.twitterclone.R

/**
 * A simple [Fragment] subclass.
 * Use the [ForgotPasswordVerifyPersonalInformation.newInstance] factory method to
 * create an instance of this fragment.
 */
class ForgotPasswordVerifyPersonalInformation : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(
            R.layout.fragment_forgot_password_verify_personal_information,
            container,
            false
        )
    }
}