package com.ozimos.databinding

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.CheckBox
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import com.ozimos.databinding.databinding.ActivitySplashScreenBinding

class SplashScreen : AppCompatActivity() {
    private var mDelayHandler: Handler? = null
    private val SPLASH_DELAY: Long = 3000 //3 seconds

    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash_screen)
        binding.ivSplash.setImageResource(R.drawable.ic_sekdes)

        //splash screen
        val SPLASH_TIME_OUT = 3000 //3second
        Handler(Looper.getMainLooper()).postDelayed({
            showDialogCheckBox()
            onStop()
        }, SPLASH_TIME_OUT.toLong())
    }

    fun showDialogCheckBox() {
        val cbDialog = findViewById<CheckBox>(R.id.cbDialog)
        val alertDialogBuilder = AlertDialog.Builder(this)
        val customLayout = getLayoutInflater().inflate(R.layout.custom_layout_alert, null)
        alertDialogBuilder.setView(customLayout)

        //ON Progress make operation on custom dialog alert
        alertDialogBuilder.setPositiveButton(
            "selanjutnya",
            DialogInterface.OnClickListener { _, _ ->
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            })
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }
}