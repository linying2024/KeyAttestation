package io.github.vvb2060.keyattestation.local.home

import android.view.View
import io.github.vvb2060.keyattestation.local.R
import io.github.vvb2060.keyattestation.local.databinding.HomeErrorBinding
import io.github.vvb2060.keyattestation.local.ktx.toHtml
import io.github.vvb2060.keyattestation.local.lang.AttestationException
import rikka.html.text.HtmlCompat
import rikka.recyclerview.BaseViewHolder.Creator

class ErrorViewHolder(itemView: View, binding: HomeErrorBinding) : HomeViewHolder<AttestationException, HomeErrorBinding>(itemView, binding) {

    companion object {

        val CREATOR = Creator<AttestationException> { inflater, parent ->
            val binding = HomeErrorBinding.inflate(inflater, parent, false)
            ErrorViewHolder(binding.root, binding)
        }
    }

    override fun onBind() {
        val context = itemView.context
        binding.apply {
            val sb = StringBuilder()
            sb.append(context.getString(data.descriptionResId)).append("<p>")

            sb.append(context.getString(R.string.error_message_subtitle)).append("<br>")
            sb.append("<font face=\"monospace\">")
            var tr = data.cause
            while (tr != null) {
                sb.append("${tr::class.java.name}: ${tr.message}").append("<br>")
                tr = tr.cause
            }
            sb.append("</font>")
            text1.text = sb.toHtml(HtmlCompat.FROM_HTML_OPTION_TRIM_WHITESPACE)
        }
    }
}
