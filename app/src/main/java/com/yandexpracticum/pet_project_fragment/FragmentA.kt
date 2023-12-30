package com.yandexpracticum.pet_project_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import com.yandexpracticum.pet_project_fragment.databinding.FragmentABinding

// Родительский класс, в который мы будем запихивать вложенные классы NestedFragmentA и NestedFragmentB.
class FragmentA : BindingFragment<FragmentABinding>() {

    override fun createBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentABinding {
        return FragmentABinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Установка названия песни и передача данных через аргументы
        binding.songText.text = requireArguments().getString(SONG_NAME_KEY)
            .plus(other = " | Parent")

        // Добавление первого вложенного фрагмента
        childFragmentManager.beginTransaction()
            .add(R.id.fragment_child_container, NestedFragmentA())
            .commit()
    }

    companion object {
        private const val SONG_NAME_KEY = "SONG_NAME_KEY"

        fun getInstance(songName: String): FragmentA = FragmentA().apply {
            arguments = bundleOf(SONG_NAME_KEY to songName)
        }
    }
}