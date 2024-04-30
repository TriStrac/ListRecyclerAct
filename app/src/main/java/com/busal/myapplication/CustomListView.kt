package com.busal.myapplication
import adapters.CustomListAdapter
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.busal.myapplication.databinding.ActivityCustomListViewBinding
import data.Fruits
import java.io.Serializable
import kotlin.random.Random

class CustomListView : AppCompatActivity() {
    private lateinit var binding: ActivityCustomListViewBinding
    private lateinit var  fruits: List<Fruits>
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityCustomListViewBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        fruits = listOf(
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
        binding.backButtonList.setOnClickListener {
            finish()
        }
        binding.customListView.isClickable = true
        binding.customListView.adapter = CustomListAdapter(this,fruits)
        binding.customListView.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, FruitDetails::class.java)
            intent.putExtra("PARAM_FRUIT",fruits[position] as Serializable)
            startActivity(intent)
        }
    }
}
