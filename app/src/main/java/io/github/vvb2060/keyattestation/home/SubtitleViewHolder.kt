package io.github.vvb2060.keyattestation.local.home

import android.view.View
import io.github.vvb2060.keyattestation.local.databinding.HomeSubtitleBinding
import rikka.recyclerview.BaseViewHolder.Creator

class SubtitleViewHolder(itemView: View, binding: HomeSubtitleBinding) : HomeViewHolder<SubtitleData, HomeSubtitleBinding>(itemView, binding) {

    companion object {

        val CREATOR = Creator<SubtitleData> { inflater, parent ->
            val binding = HomeSubtitleBinding.inflate(inflater, parent, false)
            SubtitleViewHolder(binding.root, binding)
        }
    }

    init {
        itemView.setOnClickListener {
            listener.onCommonDataClick(data)
        }
    }

    override fun onBind() {
        binding.title.setText(data.title)
    }
}
