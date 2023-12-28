package com.yandexpracticum.pet_project_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.commit
import com.yandexpracticum.pet_project_fragment.databinding.FragmentBNestedBinding


class NestedFragmentB : Fragment() {
    private var _binding: FragmentBNestedBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBNestedBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /**
         * Тут также при нажатии на кнопку заменяем фрагмент из "fragment_child_container" на
         * другой.
         */
        binding.button.setOnClickListener {
            parentFragmentManager.commit {
                replace(R.id.fragment_child_container, NestedFragmentA())
            }
        }
    }
}