package com.example.myuiwidgets.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myuiwidgets.R

import android.text.TextUtils
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


/**
 * Simple Kotlin application for UI Widgets
 * (Button, EditText, Form, SeekBar, Spinner)
 * and
 * Extension Function
 *
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

class MainActivity : AppCompatActivity() {


    val TAG = MainActivity::class.java.simpleName

    lateinit var tv_hello_world_1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_hello_world_1 = findViewById<TextView>(R.id.tv_hello_world_1)

        tv_hello_world_1.text =
            "The latest developer preview of Android, bringing performance enhancements and new features to your apps."
        tv_hello_world_1.setSingleLine()
        tv_hello_world_1.ellipsize = TextUtils.TruncateAt.MARQUEE
        tv_hello_world_1.marqueeRepeatLimit = -1
        tv_hello_world_1.isSelected = true

        btnButton()
        btnEditText()
        btnForm()
        btnSeekBar()
        btnSpinner()
    }

    private fun btnButton() {
        btn_button.setOnClickListener {
            Log.i(TAG, "Button clicked!")
            val intent = Intent(this, ButtonActivity::class.java)
            startActivity(intent)
        }
    }

    private fun btnEditText() {
        btn_edit_text.setOnClickListener {
            Log.i(TAG, "Edit Text Button clicked!")
            val intent = Intent(this, EditTextActivity::class.java)
            startActivity(intent)
        }
    }

    private fun btnForm() {
        btn_form.setOnClickListener {
            Log.i(TAG, "Form Button clicked!")
            val intent = Intent(this, FormActivity::class.java)
            startActivity(intent)
        }
    }

    private fun btnSeekBar() {
        btn_seek_bar.setOnClickListener {
            Log.i(TAG, "Seek Bar Button clicked!")
            val intent = Intent(this, SeekBarActivity::class.java)
            startActivity(intent)
        }
    }

    private fun btnSpinner() {
        btn_spinner.setOnClickListener {
            Log.i(TAG, "Spinner Button clicked!")
            val intent = Intent(this, SpinnerActivity::class.java)
            startActivity(intent)
        }
    }

}
