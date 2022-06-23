package com.example.twitterClone.ui.fragment.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.twitterclone.databinding.FragmentForgotPasswordVerifyPersonalInformationBinding

/**
 * A simple [Fragment] subclass.
 * Use the [FPVerifyPersonalInfo.newInstance] factory method to
 * create an instance of this fragment.
 */
class FPVerifyPersonalInfo : Fragment() {
    private lateinit var FragmentForgotPasswordVerifyPersonalInformationBinding: FragmentForgotPasswordVerifyPersonalInformationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        FragmentForgotPasswordVerifyPersonalInformationBinding  =
            com.example.twitterclone.databinding.FragmentForgotPasswordVerifyPersonalInformationBinding.inflate(layoutInflater,container,false)

        return FragmentForgotPasswordVerifyPersonalInformationBinding.root
    }
}