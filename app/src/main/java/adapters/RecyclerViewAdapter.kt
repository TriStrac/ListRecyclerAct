package adapters
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.busal.myapplication.databinding.RecyclerViewListBinding
import data.Fruits

class RecyclerViewAdapter(
    private val fruits: List<Fruits>,
    private val listener: OnItemClickListener
) : RecyclerView.Adapter<RecyclerViewAdapter.FruitViewHolder>() {

    interface OnItemClickListener {
        fun onItemClick(fruit: Fruits)
    }

    class FruitViewHolder(private val binding: RecyclerViewListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(fruit: Fruits, listener: OnItemClickListener) {
            binding.fruitNameText.text = fruit.name
            binding.fruitQtyText.text = fruit.quantity.toString()
            itemView.setOnClickListener { listener.onItemClick(fruit) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RecyclerViewListBinding.inflate(inflater, parent, false)
        return FruitViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        holder.bind(fruits[position], listener)
    }

    override fun getItemCount() = fruits.size
}
