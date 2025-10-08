package com.example.firsttest

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.th2)

        val button = findViewById<Button>(R.id.button)
        val editText = findViewById<EditText>(R.id.editTextText)
        val errorText = findViewById<TextView>(R.id.textView6)
        val container = findViewById<LinearLayout>(R.id.containerLayout)

        button.setOnClickListener {
            val input = editText.text.toString().trim()
            val number = input.toIntOrNull()


            if (number == null || number <= 0) {
                errorText.visibility = View.VISIBLE
                container.visibility = View.GONE
                return@setOnClickListener
            }

            errorText.visibility = View.GONE
            container.visibility = View.VISIBLE

            container.removeAllViews()

            for (i in 1..number) {
                val cardView = CardView(this).apply {
                    val params = LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        150
                    )

                    params.setMargins(0, 20, 0, 0)
                    layoutParams = params
                    radius = 50f
                    setCardBackgroundColor(Color.parseColor("#FD0101"))
                }

                val textView = TextView(this).apply {
                    text = "$i"
                    textSize = 20f
                    setTextColor(Color.parseColor("#FFFFFF"))
                    gravity = android.view.Gravity.CENTER
                }

                cardView.addView(textView)

                container.addView(cardView)
            }
        }

        val buttonNext = findViewById<Button>(R.id.button4)
        buttonNext.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
