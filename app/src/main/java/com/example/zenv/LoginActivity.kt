package com.example.zenv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.content.Intent
import android.widget.TextView
import org.w3c.dom.Text


class LoginActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin:Button = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener(this)

        val loginOption:TextView = findViewById(R.id.tvRegisterOption)
        loginOption.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.btnLogin -> {
                val switchPage = Intent(this@LoginActivity, MainActivity::class.java)
                startActivity(switchPage)
            }
            R.id.tvRegisterOption -> {
                val switchPage = Intent(this@LoginActivity, RegisterActivity::class.java)
                startActivity(switchPage)
            }
        }
    }
}