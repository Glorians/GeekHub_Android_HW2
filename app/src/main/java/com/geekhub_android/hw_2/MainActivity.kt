package com.geekhub_android.hw_2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val NUMBER = 5;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickSentResult (view: View) {
        val a: Int = num1.text.toString().toInt();
        val b: Int = num2.text.toString().toInt();

        val resultActivity = Intent(this, ResultActivity::class.java)
        val result: Int = a+b;

        startActivityForResult(resultActivity, NUMBER)

    }

    override  fun onActivityResult (requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == NUMBER && resultCode == Activity.RESULT_OK) {
            data?.hasExtra("")
        }
    }


}
