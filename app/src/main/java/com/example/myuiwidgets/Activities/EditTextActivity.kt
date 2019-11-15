package com.example.myuiwidgets.Activities

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myuiwidgets.R


class EditTextActivity : AppCompatActivity() {

    lateinit var edittext: EditText
    lateinit var result: TextView
    lateinit var copy: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)

        edittext = findViewById<EditText>(R.id.edit_text)
        result = findViewById<TextView>(R.id.tv_result)
        copy = findViewById<Button>(R.id.btn_copy)

        copy.setOnClickListener {
            result.text = edittext.text
        }

        edittext.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                result.text = s
            }
        })

    }
}
