package com.example.mockupapp.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import com.example.mockupapp.R
import com.example.mockupapp.adapters.AliciaGridAdapter
import com.example.mockupapp.data.AliciaGridItem


class AliciaProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_alicia_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val gridItems = listOf(
            AliciaGridItem(R.drawable.baseline_chat_24,"Chat"),
            AliciaGridItem(R.drawable.baseline_chat_24,"Chat"),
            AliciaGridItem(R.drawable.baseline_location_on_24,"Location"),
            AliciaGridItem(R.drawable.baseline_people_24,"Friends"),
            AliciaGridItem(R.drawable.music,"Music"),
            AliciaGridItem(R.drawable.baseline_notifications_24,"Notifications")
        )

        val gridView: GridView = view.findViewById(R.id.button_grid)
        val adapter = AliciaGridAdapter(requireContext(),gridItems)
        gridView.adapter = adapter
    }
}