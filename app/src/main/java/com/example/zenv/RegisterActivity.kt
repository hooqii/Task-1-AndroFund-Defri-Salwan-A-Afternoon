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

class  RegisterActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etEmail:EditText
    private lateinit var etPassword:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword )

        val btnRegister: Button = findViewById(R.id.btnRegister)
        btnRegister.setOnClickListener(this)
        val loginOption: TextView = findViewById(R.id.tvLoginOption)
        loginOption.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.btnRegister -> {
                val user = User(etEmail.text.toString(), etPassword.text.toString())
                val switchPage = Intent(this@RegisterActivity, MainActivity::class.java)
                switchPage.putExtra("email",user)
                startActivity(switchPage)
            }
            R.id.tvLoginOption -> {

                val bundle = Bundle()
                bundle.putString("email",etEmail.text.toString())
                bundle.putString("password",etPassword.text.toString())

                val switchPage = Intent(this@RegisterActivity, LoginActivity::class.java)
                switchPage.putExtras(bundle)
                startActivity(switchPage)
            }
        }
    }
}