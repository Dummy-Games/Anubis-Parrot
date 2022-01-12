package com.nasstyo.kofdav.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.nasstyo.kofdav.R

class gfgfgfgfdgf : Fragment(R.layout.fggfdgffd) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn).setOnClickListener {
            findNavController().popBackStack()
        }
    }
}
