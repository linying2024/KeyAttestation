package io.github.vvb2060.keyattestation.local.home

import androidx.annotation.StringRes

abstract class Data {

    abstract val title: Int
        @StringRes get

    abstract val description: Int
        @StringRes get
}

data class HeaderData(override val title: Int, override val description: Int, val icon: Int, val color: Int) : Data()

data class CommonData(override val title: Int, override val description: Int, val data: String?) : Data()

data class AuthorizationItemData(override val title: Int, override val description: Int, val data: String?, val tee: Boolean) : Data() {
    constructor(title: Int, description: Int, data: String?, fallback: String?) : this(title, description, data ?: fallback, data != null)
}

data class SecurityLevelData(override val title: Int, override val description: Int, val securityLevelDescription: Int, val version: String, val securityLevel: Int) : Data()

data class SubtitleData(override val title: Int, override val description: Int) : Data()
