package com.example.kotlin_series

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import org.w3c.dom.Text

class LoginActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)

        val button = findViewById<Button>(R.id.button)
        button.text = "Submit"

        fun checkDetails(){
            val email = findViewById<TextInputEditText>(R.id.textInputEditText3).text
            val password = findViewById<TextInputEditText>(R.id.textInputEditText4).text
            val mapLoginDetails = mapOf("customer1@gmail.com" to "customer1","customer2@gmail.com" to "customer2","customer3@gmail.com" to "customer3")
            if (email!!.isEmpty() && password!!.isEmpty()){
                button.text = "All fields are required"
            }
            else {
                val emails = mapLoginDetails.keys
                val passwords = mapLoginDetails.values
                if(emails.contains(email.toString()) && passwords.contains(password.toString())) {
                    if (mapLoginDetails[email.toString()] == password.toString()){
                        button.text = "You are authorized"
                    } else {
                        button.text = "wrong details"
                    }
                }else {
                    button.text = "wrong details"
                }
            }
        }

        button.setOnClickListener { checkDetails() }

    }
}
