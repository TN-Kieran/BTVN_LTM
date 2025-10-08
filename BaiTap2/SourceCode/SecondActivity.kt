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

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.th3)

        val button = findViewById<Button>(R.id.button2)
        val editHoVaTen = findViewById<EditText>(R.id.editHoVaTen)
        val editTuoi = findViewById<EditText>(R.id.editTuoi)
        val noticeText = findViewById<TextView>(R.id.textView10)

        button.setOnClickListener {
            val tuoi = editTuoi.text.toString().toIntOrNull()

            if(editHoVaTen.text.toString().trim().isEmpty()
                || editTuoi.text.toString().trim().isEmpty()
                || tuoi == null){
                noticeText.text = "Điền sai thông tin"
                return@setOnClickListener
            }

            var text : String? = null

            if(tuoi > 65){
                text = "Bạn là người già"
            }else if(tuoi > 5){
                text = "Bạn là người lớn"
            }else if(tuoi > 1){
                text = "Bạn là trẻ em"
            }else{
                text = "Bạn là em bé"
            }

            noticeText.setTextColor(Color.parseColor("#00C100"))
            noticeText.text = text
        }

        val buttonBack = findViewById<Button>(R.id.button6)
        buttonBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val buttonNext = findViewById<Button>(R.id.button5)
        buttonNext.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

    }
}