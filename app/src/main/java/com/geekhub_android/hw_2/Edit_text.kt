package com.geekhub_android.hw_2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_edit_text.*

class Edit_text : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)
    }

    //TODO Apply
    fun onClickApply(view: View) {
        val intent = Intent()
        intent.putExtra("header", edit_header.text.toString())
        intent.putExtra("main_text", editText.text.toString())
        setResult(Activity.RESULT_OK, intent)
        finish()
    }

}
