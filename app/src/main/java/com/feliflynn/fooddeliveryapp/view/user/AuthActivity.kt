package com.feliflynn.fooddeliveryapp.view.user

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.ActionBar
import androidx.viewpager2.widget.ViewPager2
import com.feliflynn.fooddeliveryapp.R
import com.feliflynn.fooddeliveryapp.adapter.AdapterAuth
import com.feliflynn.fooddeliveryapp.databinding.ActivityAuthBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener
import com.google.android.material.tabs.TabLayoutMediator
import java.util.*

class AuthActivity : AppCompatActivity() {

    private val adapter by lazy { AdapterAuth(this) }
    lateinit var binding: ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var viewPager: ViewPager2 = binding.viewPager
        viewPager.adapter = adapter


    }
}