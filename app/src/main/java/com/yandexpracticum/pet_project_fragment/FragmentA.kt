package com.yandexpracticum.pet_project_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yandexpracticum.pet_project_fragment.databinding.FragmentABinding

class FragmentA : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentABinding.inflate(inflater, container, false).root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Добавляем первый вложенный фрагмент
        childFragmentManager.beginTransaction()
            .add(R.id.fragment_child_container, NestedFragmentA())
            .commit()
    }
}