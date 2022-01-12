package com.nasstyo.kofdav.ui.game

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.nasstyo.kofdav.R
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine
import kotlin.random.Random

class fddsfdsfssf : FrameLayout {

    constructor(context: Context) : super(context) {
        fdgdssfgsdf(context)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        fdgdssfgsdf(context)
    }

    private fun fdgdssfgsdf(context: Context) {
        LayoutInflater.from(context).inflate(R.layout.gtdfsvsfhf, this)
        findViewById<fdsfsfdsfdssd>(R.id.currentImage).bfggsdfsd()
        findViewById<fdsfsfdsfdssd>(R.id.nextImage).bdbfgdgfsf(fdsfdfdbdfg())
    }

    suspend fun dvsfdgfdgfd(): Int {
        repeat(sdadsadas.fewfsdfdsfd) { iteration ->
            if (iteration % 2 == 0) {
                fbgdghdhfgdf(findViewById(R.id.currentImage), findViewById(R.id.nextImage))
            } else {
                fbgdghdhfgdf(findViewById(R.id.nextImage), findViewById(R.id.currentImage))
            }
        }
        return if (sdadsadas.fewfsdfdsfd % 2 == 0) findViewById<fdsfsfdsfdssd>(R.id.currentImage).fdgdsdgsfd else findViewById<fdsfsfdsfdssd>(
            R.id.nextImage
        ).fdgdsdgsfd
    }

    private suspend fun fbgdghdhfgdf(centerImage: fdsfsfdsfdssd, bottomImage: fdsfsfdsfdssd) =
        suspendCoroutine<Unit> { continuation ->
            centerImage.animate()
                .translationY(-height.toFloat())
                .setDuration(sdadsadas.asasdasdsa).start()

            bottomImage.translationY = bottomImage.height.toFloat()

            bottomImage.animate().apply {
                translationY(0f)
                duration = sdadsadas.asasdasdsa
                withEndAction {
                    centerImage.bdbfgdgfsf(fdsfdfdbdfg())
                    continuation.resume(Unit)
                }
                start()
            }
        }

    private fun fdsfdfdbdfg() = Random.nextInt(Int.MAX_VALUE) % sdadsadas.dfvdbdg
}
