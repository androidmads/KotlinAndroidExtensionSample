package com.androidmads.kotlinsample_helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*;

class MainActivity : AppCompatActivity() {

    // Declaration
    var helloTextView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialization
        helloTextView = findViewById(R.id.helloTxtView) as TextView
        // Assigning data to TextView in runtime
        helloTextView!!.text = "Hello Kotlin!";

        // Click Listener in Kotlin
        helloTextView!!.setOnClickListener({
            Toast.makeText(applicationContext, "Hello TextView Clicked", Toast.LENGTH_LONG).show();
        })

        // Hello Program for Kotlin Android Extension
        helloAndroidExtension.text = "Example for Kotlin Android Extension";

        imageView.setImageResource(R.mipmap.ic_launcher_round)
    }
}
