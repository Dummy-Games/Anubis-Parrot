package com.nasstyo.kofdav.ui.game

import android.content.Context
import android.util.AttributeSet
import com.nasstyo.kofdav.util.gdfgdfgdf

class fdsfsfdsfdssd : androidx.appcompat.widget.AppCompatImageView {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    var fdgdsdgsfd = 0

    fun bdbfgdgfsf(value: Int) {
        fdgdsdgsfd = value
        setImageResource(gdfgdfgdf(getSlotName(fdgdsdgsfd)))
    }

    fun bfggsdfsd() = bdbfgdgfsf(FIRST_SLOT_VALUE)

    companion object {
        private const val SLOT_ID_PREFIX = "gh"

        const val FIRST_SLOT_VALUE = 0

        private fun getSlotName(position: Int) = SLOT_ID_PREFIX + (position + 1)
    }
}
