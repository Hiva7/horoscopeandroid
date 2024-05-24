package com.example.horoscope

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input = findViewById<EditText>(R.id.input)
        val submit = findViewById<Button>(R.id.submit)
        val output = findViewById<TextView>(R.id.output)

        val horoscopes = arrayOf(
            "You will have a great day!",
            "Be cautious of the decisions you make today.",
            "An exciting opportunity awaits you.",
            "You might face some challenges, but stay strong.",
            "Expect good news soon.",
            "Today might not go as planned, but don't lose hope.",
            "You will overcome a challenge today.",
            "Avoid conflicts as much as possible today.",
            "A pleasant surprise is in store for you.",
            "You might encounter some negative vibes, stay positive.",
            "Today is a perfect day for new beginnings.",
            "An unexpected setback may occur, but you can handle it.",
            "You will make a new friend today.",
            "Beware of false promises today.",
            "Success is on the horizon.",
            "You may feel a bit overwhelmed, take it easy.",
            "Happiness and prosperity will come your way.",
            "Today could be stressful, but keep your head up.",
            "You will achieve your goals.",
            "You might feel a bit down today, but brighter days are ahead."
        )

        submit.setOnClickListener {
            val inputText = input.text.toString()
            if (inputText.isNotEmpty()) {
                val asciiValue = inputText.sumOf { it.code }
                val index = asciiValue % horoscopes.size
                output.text = horoscopes[index]
            } else {
                output.text = "Please enter some text."
            }
        }
    }
}
