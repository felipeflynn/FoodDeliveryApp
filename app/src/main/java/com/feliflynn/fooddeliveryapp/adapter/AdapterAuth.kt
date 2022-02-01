package com.feliflynn.fooddeliveryapp.adapter
import android.app.ActivityManager
import android.content.Context;
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.feliflynn.fooddeliveryapp.view.user.LoginFragment
import com.feliflynn.fooddeliveryapp.view.user.SingUpFragment

class AdapterAuth(fa: FragmentActivity) :
    FragmentStateAdapter(fa) {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return LoginFragment()
            1 -> return SingUpFragment()
        }
        return LoginFragment()
    }

}