package com.example.mockupapp.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.mockupapp.R
import com.example.mockupapp.adapters.TatumGridItemAdapter
import com.example.mockupapp.data.TatumGridItem

class TatumProfileFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tatum_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val gridItems = listOf(
            TatumGridItem(R.drawable.village, "Village","45 minutes ago","93"),
            TatumGridItem(R.drawable.street, "NY street","2 hours ago","214"),
            TatumGridItem(R.drawable.bridge, "Brooklyn Bridge","5 days ago","300")
        )
        val gridView: GridView = view.findViewById(R.id.grid_photo)
        val adapter = TatumGridItemAdapter(requireContext(),gridItems)
        gridView.adapter = adapter

        val drawerLayout: DrawerLayout = view.findViewById(R.id.tatumFragment)
        val toolbar: Toolbar = view.findViewById(R.id.topAppBar)

        toolbar.setNavigationOnClickListener{
            drawerLayout.openDrawer(GravityCompat.START)
        }
    }
}