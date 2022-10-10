package com.lesson_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        if (savedInstanceState != null) {
            counter = savedInstanceState.getInt("counterKey")
            tv_counter.text = counter.toString()
        }

        btn_counter.setOnClickListener {
            counter++
            tv_counter.text = counter.toString()
        }

        // That's android project
    }

    override fun onSaveInstance(outState: Bundle) {
        outState.putInt("counterKey", counter)

        super...
    }
}