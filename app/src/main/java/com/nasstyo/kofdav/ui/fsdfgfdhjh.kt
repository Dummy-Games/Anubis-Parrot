package com.nasstyo.kofdav.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.nasstyo.kofdav.R

class fsdfgfdhjh : Fragment(R.layout.bgfhfhj) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btnPlay).setOnClickListener {
            findNavController().navigate(R.id.gameFragment)
        }
    }
}
