package com.example.desafio2.view.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.desafio2.R

class SplashActivity : AppCompatActivity() {
    private val splashTime:Long = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.supportActionBar?.hide();

        setContentView(R.layout.activity_splash)



        val mHandler = Handler(Looper.getMainLooper())
            mHandler.postDelayed({
            // This method will be executed once the timer is over
            // Start your app main activity

            startActivity(Intent(this,LoginActivity::class.java))

            // close this activity
            finish()
        }, splashTime)

        findViewById<ConstraintLayout>(R.id.splashScreen).setOnClickListener(){
            mHandler.removeCallbacksAndMessages(null);

            startActivity(Intent(this,LoginActivity::class.java))

            // close this activity
            finish()
        }

    }
}