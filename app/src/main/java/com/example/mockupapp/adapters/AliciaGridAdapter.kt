package com.example.mockupapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageButton
import android.widget.TextView
import com.example.mockupapp.R
import com.example.mockupapp.data.AliciaGridItem

class AliciaGridAdapter(private val context: Context, private val data: List<AliciaGridItem>) : BaseAdapter() {

    override fun getCount(): Int {
        // Return the total number of grid items
        return 6
    }

    override fun getItem(position: Int): Any {
        // Return the data object at the specified position
        return position
    }

    override fun getItemId(position: Int): Long {
        // Return a unique ID for the item at the specified position
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val inflater = LayoutInflater.from(context)
        val view = convertView ?: inflater.inflate(R.layout.alicia_profile_gridview_item, parent, false)

        val imageButton: ImageButton = view.findViewById(R.id.button_image)
        val textView: TextView = view.findViewById(R.id.button_text)

        val item = data[position]

        // Set image and text for the button
        imageButton.setImageResource(item.imageResId)
        textView.text = item.text

        // Set click listener or perform any necessary data binding here
        imageButton.setOnClickListener {
            // Handle button click event
        }

        return view
    }
}