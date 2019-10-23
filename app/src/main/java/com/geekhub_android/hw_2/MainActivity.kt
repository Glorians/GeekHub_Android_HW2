package com.geekhub_android.hw_2

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val NUMBER = 1;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //TODO ClickEdit
    fun onClickEdit (view: View) {
        val intent = Intent(this, Edit_text::class.java)
        startActivityForResult(intent, NUMBER)
    }

    //TODO ActivityResult
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == NUMBER && resultCode == Activity.RESULT_OK) {
            if (data != null) {
                text_header.text = (data.getStringExtra("header"))
                main_text.text = data.getStringExtra("main_text")
            }
        }
        super.onActivityResult(requestCode, resultCode, data)
    }

    fun onClickSend (view: View) {
        val intent = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:"))
        intent.putExtra(Intent.EXTRA_SUBJECT, text_header.text.toString())
        intent.putExtra(Intent.EXTRA_TEXT, main_text.text.toString())
        startActivity(Intent.createChooser(intent, "hello, world"))
    }


}
