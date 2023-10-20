package com.ai4access.app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.ai4access.app.databinding.FragmentStartBinding


class StartFragment : Fragment() {

    private lateinit var binding: FragmentStartBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStartBinding.inflate(inflater,container,false)


        binding.btnLogin.setOnClickListener {
            findNavController().navigate(R.id.action_startFragment_to_login1Fragment)
        }

        binding.txtSingup.setOnClickListener {
            findNavController().navigate(R.id.action_startFragment_to_signup1Fragment)
        }



        return binding.root
    }

}