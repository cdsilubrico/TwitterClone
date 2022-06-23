package com.example.twitterClone.ui.fragment.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.twitterclone.R
import com.example.twitterclone.databinding.FragmentFPVerifyPersonalInfoBinding

class FPVerifyPersonalInfo : Fragment() {

    lateinit var FragmentFPVerifyPersonalInfoBinding: FragmentFPVerifyPersonalInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        FragmentFPVerifyPersonalInfoBinding = com.example.twitterclone.databinding.FragmentFPVerifyPersonalInfoBinding.inflate(
            layoutInflater,
            container,
            false)

        return FragmentFPVerifyPersonalInfoBinding.root
    }

}