package uz.sher.uzmobile.activity


import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

import uz.sher.uzmobile.databinding.ActivitySplashBinding


@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val countDownTimer=object:CountDownTimer(1000,1000){
            override fun onTick(millisUntilFinished: Long) {
            }
            @SuppressLint("SuspiciousIndentation")
            override fun onFinish() {
                val intent=Intent(this@SplashActivity, MainActivity::class.java)
                    startActivity(intent)
                finish()

            }

        }.start()

    }
}