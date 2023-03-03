package com.example.world

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val timer = object : CountDownTimer(8000,1000) {
            override fun onTick(millisUntlFinished: Long) {
            }

            override fun onFinish() {
                val intent = Intent(this@MainActivity,SigninActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
        timer.start()
    }
}