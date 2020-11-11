package com.ozimos.databinding

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.ozimos.databinding.databinding.CustomLayoutAlertBinding

class CustomLayoutAlert : AppCompatActivity() {

    private val binding by lazy { CustomLayoutAlertBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btDialog.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}