package com.example.firsttest

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.th4)

        val editEmail = findViewById<EditText>(R.id.editTextText2)
        val button = findViewById<Button>(R.id.button3)
        val noticeText = findViewById<TextView>(R.id.textView7)

        button.setOnClickListener {
            val formatedText = editEmail.text.toString().trim()
            if(formatedText.isEmpty()){
                noticeText.setTextColor(Color.parseColor("#FD0303"))
                noticeText.text = "Email không hợp lệ"
                return@setOnClickListener
            }
            var isHaved = false
            formatedText.forEach { char -> if(char == '@') isHaved = true }
            if(!isHaved){
                noticeText.setTextColor(Color.parseColor("#FD0303"))
                noticeText.text = "Email không đúng định dạng"
                return@setOnClickListener
            }

            noticeText.setTextColor(Color.parseColor("#0BFD03"))
            noticeText.text = "Bạn đã nhập email hợp lệ"
        }

        val buttonBack = findViewById<Button>(R.id.button7)
        buttonBack.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

    }
}