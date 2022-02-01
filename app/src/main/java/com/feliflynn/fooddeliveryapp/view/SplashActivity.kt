package com.feliflynn.fooddeliveryapp.view

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.feliflynn.fooddeliveryapp.view.user.AuthActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //val sharedpref:SharedPreferences = getSharedPreferences("auth", MODE_PRIVATE)
        //if(sharedpref.getBoolean("login",false)){
           // startActivity(Intent(this, MainActivity::class.java))
            //finish()
        //}else {
            startActivity(Intent(this, AuthActivity::class.java))
            finish()
        //}
    }
}