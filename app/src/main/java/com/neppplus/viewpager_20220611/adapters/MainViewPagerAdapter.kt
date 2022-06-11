package com.neppplus.viewpager_20220611.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.viewpager_20220611.fragments.AddressFragment
import com.neppplus.viewpager_20220611.fragments.HelloFragment
import com.neppplus.viewpager_20220611.fragments.NameFragment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {

        return 3
    }

    override fun getItem(position: Int): Fragment {
        if ( position == 0 ) {
            return HelloFragment()
        }
        else if (position == 1) {
            return NameFragment()
        }
        else {
            return AddressFragment()
        }
    }
}