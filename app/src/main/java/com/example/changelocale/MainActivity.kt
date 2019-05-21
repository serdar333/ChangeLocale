package com.example.changelocale

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    override fun attachBaseContext(newBase: Context?) {
        if (newBase != null) {
            super.attachBaseContext(ActivityController.createUpdateLocaleContext(newBase, "ru"))
        }
        else {
            super.attachBaseContext(baseContext)
        }
    }

    override fun onResume() {
        super.onResume()
        println("=================== locale is: " + resources.configuration.locale)
    }
}
