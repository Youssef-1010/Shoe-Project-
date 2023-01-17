package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.udacity.shoestore.databinding.FragmentLoginFregmentBinding


class LoginFregment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentLoginFregmentBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_login_fregment, container, false)

        binding.LoginButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_loginFregment_to_welcomeFregment2)

        }

        binding.RegistrationButton.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_loginFregment_to_welcomeFregment2)
        }


        return binding.root
    }
}