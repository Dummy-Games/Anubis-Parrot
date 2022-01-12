package com.nasstyo.kofdav.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.nasstyo.kofdav.R

@SuppressLint("CustomSplashScreen")
class vfdsfdsddfsd : Fragment(R.layout.gfhjgeweg) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<ImageView>(R.id.ivLogo).animate()
            .setDuration(3_000L)
            .scaleX(2f)
            .scaleY(2f)
            .withEndAction {
                findNavController().navigate(
                    R.id.startingFragment, null,
                    navOptions {
                        popUpTo(R.id.nav_graph) {
                            inclusive = true
                        }
                    }
                )
            }.start()
    }
}
