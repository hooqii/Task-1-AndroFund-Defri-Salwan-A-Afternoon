package com.example.zenv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.zenv.databinding.ActivityLoginBinding
import com.example.zenv.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var tvEmail: TextView
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFragment1.setOnClickListener { replaceFragment(Fragment1()) }
        binding.btnFragment2.setOnClickListener { replaceFragment(Fragment2()) }

        tvEmail = findViewById(R.id.tvEmail)

//        val user = intent.getParcelableExtra<User>("user")
        val email = intent.getParcelableExtra<User>("email")?.email

        tvEmail.text = "Wellcome, $email"

    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainerView, fragment)
        fragmentTransaction.commit()
    }
}