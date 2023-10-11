package com.jetbrains.simplelogin.googleimasample

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.textView).setOnClickListener {
            startActivity(
                Intent(this, MainActivity::class.java),
                ActivityOptions.makeCustomAnimation(
                    this,
                    R.anim.k_slide_right_in,
                    R.anim.k_slide_left_out
                ).toBundle()
            )

        }
    }
}