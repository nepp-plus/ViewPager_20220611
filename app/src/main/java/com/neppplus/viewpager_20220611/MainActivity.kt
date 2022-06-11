package com.neppplus.viewpager_20220611

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.viewpager_20220611.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mAdapter:  MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    fun setupEvents() {

    }

    fun setValues() {

        mAdapter = MainViewPagerAdapter( supportFragmentManager )

        mainViewPager.adapter = mAdapter

//        화면의 탭레이아웃을, 뷰페이저와 연결

        mainTabLayout.setupWithViewPager( mainViewPager )

    }

}