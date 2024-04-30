package com.busal.myapplication
import adapters.RecyclerViewAdapter
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.busal.myapplication.databinding.ActivityRecyclerViewBinding
import data.Fruits
import java.io.Serializable
import kotlin.random.Random

class RecyclerView : AppCompatActivity(), RecyclerViewAdapter.OnItemClickListener {
    private lateinit var binding: ActivityRecyclerViewBinding
    private lateinit var fruits: MutableList<Fruits>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fruits = mutableListOf(
            Fruits("Apple", Random.nextInt(1, 20)),
            Fruits("Banana", Random.nextInt(1, 20)),
            Fruits("Cherry", Random.nextInt(1, 20)),
            Fruits("Date", Random.nextInt(1, 20)),
            Fruits("Elderberry", Random.nextInt(1, 20)),
            Fruits("Fig", Random.nextInt(1, 20)),
            Fruits("Grape", Random.nextInt(1, 20)),
            Fruits("Honeydew", Random.nextInt(1, 20)),
            Fruits("Kiwi", Random.nextInt(1, 20)),
            Fruits("Lemon", Random.nextInt(1, 20)),
            Fruits("Mango", Random.nextInt(1, 20)),
            Fruits("Orange", Random.nextInt(1, 20)),
            Fruits("Peach", Random.nextInt(1, 20)),
            Fruits("Quince", Random.nextInt(1, 20)),
            Fruits("Raspberry", Random.nextInt(1, 20))
        )
        binding.backButtonRecycler.setOnClickListener {
            finish()
        }
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = RecyclerViewAdapter(fruits, this)
    }

    override fun onItemClick(fruit: Fruits) {
        val intent = Intent(this, FruitDetails::class.java)
        intent.putExtra("PARAM_FRUIT", fruit as Serializable)
        startActivity(intent)
    }
}
