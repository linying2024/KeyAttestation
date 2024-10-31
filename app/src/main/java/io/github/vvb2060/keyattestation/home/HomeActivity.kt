package io.github.vvb2060.keyattestation.local.home

import android.os.Bundle
import io.github.vvb2060.keyattestation.local.BuildConfig
import io.github.vvb2060.keyattestation.local.R
import io.github.vvb2060.keyattestation.local.app.AppBarFragmentActivity

class HomeActivity : AppBarFragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.subtitle = BuildConfig.VERSION_NAME

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, HomeFragment())
                    .commit()
        }
    }
}
