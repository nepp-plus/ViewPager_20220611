package com.neppplus.viewpager_20220611.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.viewpager_20220611.fragments.AddressFragment
import com.neppplus.viewpager_20220611.fragments.HelloFragment
import com.neppplus.viewpager_20220611.fragments.NameFragment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getCount() = 3

    override fun getItem(position: Int): Fragment {

        return when(position) {
            0 -> HelloFragment()
            1 -> NameFragment()
            else -> AddressFragment()
        }

    }

    override fun getPageTitle(position: Int): CharSequence? {

        return when(position) {
            0 -> "인사말"
            1 -> "이름"
            else -> "거주지"
        }

    }

}