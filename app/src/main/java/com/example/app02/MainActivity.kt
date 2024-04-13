package com.example.app02

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.app02.databinding.ActivityMainBinding

// App 02: Conversor Real-Dolar e Real-Euro

class MainActivity : AppCompatActivity() {
    
    private lateinit var binding : ActivityMainBinding
    
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            val numero: Double = binding.editReais.text.toString().toDouble()
            val dolares = String.format("%.2f", numero/4.90)
            val euro = String.format("%.2f", numero/5.37)
            binding.valorDolares.text = "US$ $dolares"
            binding.valorEuros.text = "€ $euro"
        }
    }
}