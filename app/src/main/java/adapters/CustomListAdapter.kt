package adapters

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.busal.myapplication.R
import data.Fruits

class CustomListAdapter (private val context: Activity,private val list:List<Fruits>) :
    ArrayAdapter<Fruits>(context, R.layout.custom_list_view_adapter,list){

    override fun getView(position: Int, convertView: View?,parent: ViewGroup): View{

        val inflater:LayoutInflater = LayoutInflater.from(context)
        val view: View = inflater.inflate(R.layout.custom_list_view_adapter,null)

        val fruitName: TextView = view.findViewById(R.id.textViewFruitName)
        val fruitQty: TextView = view.findViewById(R.id.textViewFruitQty)

        fruitName.text = list[position].name
        fruitQty.text = "Quantity: ${list[position].quantity}"


        return view

    }
}

