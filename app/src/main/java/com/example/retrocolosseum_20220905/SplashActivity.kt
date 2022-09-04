package com.example.retrocolosseum_20220905

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : BaseActivity() {

    var isTokenOk = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        val myHandler = Handler(Looper.getMainLooper())
        myHandler.postDelayed({

            //이프엘스문 한 줄로 코드해봐 인텐트로 어떻게 묶어갈것인가
            if(isTokenOk){
                val myIntent = Intent(mContext, MainActivity::class.java)
                startActivity(myIntent)
            }
            else{
                val myIntent = Intent(mContext, LoginActivity::class.java)
                startActivity(myIntent)
            }
            finish()

        },2500)


    }
}