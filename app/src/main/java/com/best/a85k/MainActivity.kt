package com.best.a85k

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.best.a85k.Adapter.AdapterPager
import com.best.a85k.Fragments.Page1
import com.best.a85k.Fragments.Page2
import com.best.a85k.Fragments.Page3
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager
    private lateinit var adapterPager: AdapterPager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         initViews()
        hideActionBar()
    }

    private fun initViews() {
        tabLayout = findViewById(R.id.table_layoutId)
        viewPager = findViewById(R.id.viewpager_ID)

        adapterPager = AdapterPager(supportFragmentManager)


        adapterPager.addLists(Page1(), "Contacts")
        adapterPager.addLists(Page2(), "Users")
        adapterPager.addLists(Page3(), "Posts")

        viewPager.adapter = adapterPager
        tabLayout.setupWithViewPager(viewPager)

        tabLayout.getTabAt(0)?.setIcon(R.drawable.call_baseline_call_24)
        tabLayout.getTabAt(1)?.setIcon(R.drawable.ic_baseline_group_24)
        tabLayout.getTabAt(2)?.setIcon(R.drawable.ic_baseline_notes_24)

    }
    private fun hideActionBar() {
        supportActionBar?.hide()
    }


}