package com.busal.myapplication
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.busal.myapplication.databinding.ActivityListViewBinding

class ListView : AppCompatActivity() {
    private lateinit var binding: ActivityListViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityListViewBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        val foodArray = arrayOf(
            "Apple",
            "Banana",
            "Cherry",
            "Date",
            "Elderberry",
            "Fig",
            "Grape",
            "Honeydew",
            "Kiwi",
            "Lemon",
            "Mango",
            "Orange",
            "Peach",
            "Quince",
            "Raspberry",
            "Strawberry",
            "Tomato",
            "Ugli fruit",
            "Vanilla bean",
            "Watermelon"
        )
        binding.backButtonListView.setOnClickListener {
            finish()
        }
        val arrayAdapter = ArrayAdapter<String>(this,R.layout.simple_list_view_adapter,R.id.textViewFruits,foodArray)
        binding.simpleList.adapter=arrayAdapter
    }
}