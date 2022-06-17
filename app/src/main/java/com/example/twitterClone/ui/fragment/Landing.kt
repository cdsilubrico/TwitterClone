package com.example.twitterClone.ui.fragment

import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.text.style.ForegroundColorSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.graphics.toColorInt
import androidx.navigation.fragment.findNavController
import com.example.twitterclone.R
import com.example.twitterclone.databinding.FragmentLandingBinding

class Landing : Fragment(R.layout.fragment_landing) {

    private lateinit var landingBinding: FragmentLandingBinding
    private lateinit var tvText:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        landingBinding = FragmentLandingBinding.inflate(inflater, container, false)

        return landingBinding.root
    }

    private fun changeLoginSubStringColor() {
        val spannableString = SpannableString(this.tvText)
        val id = resources.getString(R.color.twitter)
        spannableString.setSpan(
            ForegroundColorSpan(id.toColorInt()),
            25,
            31,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        landingBinding.haveAnAccountAlready.text = spannableString
    }

    private fun changePrivacyTermsSubStringColor() {
        val tvText = resources.getString(R.string.label_terms_privacy_policy_cookie)
        val spannableString = SpannableString(tvText)
        val id = resources.getString(R.color.twitter)
        spannableString.setSpan(
            ForegroundColorSpan(id.toColorInt()),
            31,
            37,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        spannableString.setSpan(
            ForegroundColorSpan(id.toColorInt()),
            38,
            53,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        spannableString.setSpan(
            ForegroundColorSpan(id.toColorInt()),
            59,
            tvText.length - 1,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        landingBinding.termsPrivacyCookie.text = spannableString
    }

    private fun setSubStringColor() {
        changeLoginSubStringColor()
        changePrivacyTermsSubStringColor()
    }

    private fun setClickableSubStringLogin() {
        val spannableString = SpannableString(this.tvText)
        val clickableSpan = object : ClickableSpan(){
            override fun onClick(widget: View) {
                onLoginClick()
            }
        }
        spannableString.setSpan(clickableSpan,25,31,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        landingBinding.haveAnAccountAlready.movementMethod = LinkMovementMethod.getInstance()
        landingBinding.haveAnAccountAlready.text = spannableString
    }

    private fun onLoginClick()
    {
        val action = LandingDirections.actionLandingToLogin()
        findNavController().navigate(action)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initializeString()
        setSubStringColor()
        setClickableSubStringLogin()
    }

    private fun initializeString() {
        this.tvText = resources.getString(R.string.label_have_an_account_already)
    }


}