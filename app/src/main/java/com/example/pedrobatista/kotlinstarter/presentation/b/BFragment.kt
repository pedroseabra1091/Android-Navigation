package com.example.pedrobatista.kotlinstarter.presentation.b

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.pedrobatista.kotlinstarter.R

class BFragment(): Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.b_fragment, container, false)
        view.findViewById<Button>(R.id.back_button_b).setOnClickListener {
            val navController = Navigation.findNavController(view)
            navController.navigateUp()
        }
        view.findViewById<Button>(R.id.next_button_b).setOnClickListener {
            val navController = Navigation.findNavController(view)
            navController.navigate(R.id.action_b_to_c)
        }
        return view
    }
}