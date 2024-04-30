package com.busal.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.busal.myapplication.databinding.ActivityFruitDetailsBinding
import data.Fruits

class FruitDetails : AppCompatActivity() {
    private lateinit var binding:ActivityFruitDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityFruitDetailsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        val selectedFruit = intent.getSerializableExtra("PARAM_FRUIT") as Fruits
        binding.fruitName.text = selectedFruit.name
        binding.fruitQuantity.text = "Quantity: ${selectedFruit.quantity.toString()}"

        binding.backButtonDetail.setOnClickListener {
            finish()
        }

    }
}