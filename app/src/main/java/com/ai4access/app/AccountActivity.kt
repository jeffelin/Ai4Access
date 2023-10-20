package com.ai4access.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ai4access.app.databinding.ActivityAccountBinding

class AccountActivity : AppCompatActivity() {

    private lateinit var binding:ActivityAccountBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}