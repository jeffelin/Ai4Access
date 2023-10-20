package com.ai4access.app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ai4access.app.databinding.FragmentLogin1Binding


class Login1Fragment : Fragment() {

    private lateinit var binding: FragmentLogin1Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLogin1Binding.inflate(inflater,container,false)




        return binding.root
    }

}