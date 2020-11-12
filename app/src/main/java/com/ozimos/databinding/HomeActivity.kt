package com.ozimos.databinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import androidx.databinding.DataBindingUtil
import com.ozimos.databinding.databinding.ActivityHomeBinding
import com.ozimos.databinding.users.view.SecondActivity

class HomeActivity : AppCompatActivity() {
    private val binding by lazy { ActivityHomeBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    binding.number1.setOnClickListener {
        val intent = Intent(this, SecondActivity::class.java )
        startActivity(intent)
    }
    binding.number2.setOnClickListener {  }
    }

}