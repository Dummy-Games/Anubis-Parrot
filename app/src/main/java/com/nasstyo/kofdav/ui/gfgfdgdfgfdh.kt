package com.nasstyo.kofdav.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.google.android.material.snackbar.Snackbar
import com.nasstyo.kofdav.R
import com.nasstyo.kofdav.ui.game.dfsdfdfsdfgfvfdsfsd
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class gfgfdgdfgfdh : Fragment(R.layout.ghfggfsfdsfd) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val gameFragment = childFragmentManager.findFragmentById(R.id.gameFragment) as dfsdfdfsdfgfvfdsfsd
        gameFragment.view?.setOnClickListener {
            lifecycleScope.launch(Dispatchers.Main) {
                val result = gameFragment.gfsdgfgddf().map { it.reduce { acc, i -> acc + i } }.reduce { acc, i -> acc + i }

                Snackbar.make(view, "You won: $result point!", Snackbar.LENGTH_SHORT).show()
            }
        }
    }
}
