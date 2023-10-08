package com.example.zenv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import android.view.View
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.log

class RegisterActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etEmail:EditText
    private lateinit var etPassword:EditText
    private lateinit var etConfirmPassword:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword )
        etConfirmPassword = findViewById(R.id.etConfirmPassword )

        val btnRegister: Button = findViewById(R.id.btnRegister)
        btnRegister.setOnClickListener(this)
        val loginOption: TextView = findViewById(R.id.tvLoginOption)
        loginOption.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.btnRegister -> {

                val email = etEmail.text.toString()
                val password = etPassword.text.toString()

                val switchPage = Intent(this@RegisterActivity, MainActivity::class.java)
                switchPage.putExtra("email",email)
                switchPage.putExtra("password",password)
                startActivity(switchPage)
            }
            R.id.tvLoginOption -> {
                val switchPage = Intent(this@RegisterActivity, LoginActivity::class.java)
                startActivity(switchPage)
            }
        }
    }
}