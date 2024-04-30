package com.busal.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.busal.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.navToListView.setOnClickListener {
            intent = Intent(this,ListView::class.java)
            startActivity(intent)
        }

        binding.navToCustomList.setOnClickListener {
            intent = Intent(this,CustomListView::class.java)
            startActivity(intent)
        }

        binding.navToRecyclerView.setOnClickListener {
            intent = Intent(this,RecyclerView::class.java)
            startActivity(intent)
        }
    }
}