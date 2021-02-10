package com.example.birthdaycardapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun createbirthdaycard(view: View) {
        val name=nameinput.editableText.toString()
        val intent=Intent(this,birthdayGreetingActivity::class.java)
        intent.putExtra(birthdayGreetingActivity.NAME_EXTRA,name)
        startActivity(intent)

       // Toast.makeText(this, "name is $name",Toast.LENGTH_LONG).show()
    }
}