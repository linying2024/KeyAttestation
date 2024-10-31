package io.github.vvb2060.keyattestation.local.app

import androidx.fragment.app.Fragment

open class AppFragment : Fragment() {

    val appActivity: AppActivity? get() = activity as AppActivity?

    fun requireAppActivity(): AppActivity {
        return appActivity ?: throw IllegalStateException("Fragment $this not attached to an activity.")
    }
}