package com.example.mockupapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.RelativeLayout
import android.widget.TextView
import com.example.mockupapp.R
import com.example.mockupapp.data.TatumGridItem

class TatumGridItemAdapter(private val context: Context, private val data: List<TatumGridItem>) : BaseAdapter()  {
    override fun getCount(): Int {
        // Return the total number of grid items
        return 3
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
        val view = convertView ?: inflater.inflate(R.layout.tatum_profile_item, parent, false)

        val relativeLayout:RelativeLayout = view.findViewById(R.id.item)
        val title: TextView = view.findViewById(R.id.title)
        val time: TextView = view.findViewById(R.id.time)
        val likes: TextView = view.findViewById(R.id.likes)

        val item = data[position]

        // Set image and text for the button
        relativeLayout.setBackgroundResource(item.imageResId)
        title.text = item.title
        time.text = item.time
        likes.text = item.likes

        return view
    }
}