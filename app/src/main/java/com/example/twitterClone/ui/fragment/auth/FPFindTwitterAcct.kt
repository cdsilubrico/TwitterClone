package com.example.twitterClone.ui.fragment.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.twitterclone.R
import com.example.twitterclone.databinding.FragmentFPFindTwitterAcctBinding

/**
 * A simple [Fragment] subclass.
 * Use the [FPFindTwitterAcct.newInstance] factory method to
 * create an instance of this fragment.
 */
class FPFindTwitterAcct : Fragment() {

    lateinit var FragmentFPFindTwitterAcctBinding : FragmentFPFindTwitterAcctBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        FragmentFPFindTwitterAcctBinding = com.example.twitterclone.databinding.FragmentFPFindTwitterAcctBinding.inflate(
            layoutInflater,
            container,
            false
        )

        return FragmentFPFindTwitterAcctBinding.root
    }

}