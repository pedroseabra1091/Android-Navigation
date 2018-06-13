package com.example.pedrobatista.kotlinstarter.presentation.b

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.Fragment
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.pedrobatista.androidnavigation.R
import com.example.pedrobatista.androidnavigation.presentation.common.BaseActivity

class BFragment(): Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       val view = inflater.inflate(R.layout.b_fragment, container, false)
        view.findViewById<Button>(R.id.back_button_b).setOnClickListener {
            val navController = Navigation.findNavController(view)
            navController.navigateUp()
        }
        return view
    }
}