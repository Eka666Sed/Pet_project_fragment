package com.yandexpracticum.pet_project_fragment

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerAdapter(hostFragment: Fragment) : FragmentStateAdapter(hostFragment) {

    override fun getItemCount(): Int = 2
    override fun createFragment(position: Int): Fragment {
        return if (position == 0) NestedFragmentA() else NestedFragmentB()
    }
}