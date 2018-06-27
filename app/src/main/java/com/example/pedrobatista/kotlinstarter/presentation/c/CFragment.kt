package com.example.pedrobatista.kotlinstarter.presentation.c

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.pedrobatista.kotlinstarter.R

class CFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.c_fragment, container, false)
        view.findViewById<Button>(R.id.back_button_c).setOnClickListener {
            val navController = Navigation.findNavController(view)
            navController.navigateUp()
        }
        view.findViewById<Button>(R.id.safe_button_c).setOnClickListener {
            val navController = Navigation.findNavController(view)
            val action = CFragmentDirections.action_c_to_d()
            action.setSafeData("Type-safe data passage between destinations.")
            navController.navigate(action)
        }
        return view
    }
}