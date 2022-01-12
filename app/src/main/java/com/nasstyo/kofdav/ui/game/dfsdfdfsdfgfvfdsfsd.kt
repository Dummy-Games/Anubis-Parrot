package com.nasstyo.kofdav.ui.game

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.fragment.app.Fragment
import com.nasstyo.kofdav.util.bdgffdgfddbgdg

class dfsdfdfsdfgfvfdsfsd : Fragment() {

    private val fdvfdhdgh = ArrayList<ArrayList<fddsfdsfssf>>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val rootLayout = LinearLayoutCompat(requireContext())
        rootLayout.orientation = LinearLayoutCompat.VERTICAL
        rootLayout.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        rootLayout.gravity = Gravity.CENTER
        repeat(sdadsadas.fdsdvcxfdgfd) {
            val rowLayout = LinearLayoutCompat(requireContext())
            rowLayout.orientation = LinearLayoutCompat.HORIZONTAL
            rowLayout.layoutParams = LinearLayoutCompat.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, 1.0f).apply {
                gravity = Gravity.CENTER
            }
            val slotsRow = ArrayList<fddsfdsfssf>()
            repeat(sdadsadas.dsdvsvsdh) {
                val slotView = fddsfdsfssf(requireContext())
                slotView.layoutParams = LinearLayoutCompat.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, 1.0f).apply {
                    topMargin = 16
                    bottomMargin = 16
                }
                rowLayout.addView(slotView)
                slotsRow.add(slotView)
            }
            rootLayout.addView(rowLayout)
            fdvfdhdgh.add(slotsRow)
        }
        return rootLayout
    }

    suspend fun gfsdgfgddf(): List<List<Int>> {
        return fdvfdhdgh.bdgffdgfddbgdg { slotsRow ->
            slotsRow.bdgffdgfddbgdg {
                it.dvsfdgfdgfd()
            }
        }
    }
}
