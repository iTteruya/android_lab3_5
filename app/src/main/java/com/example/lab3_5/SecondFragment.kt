package com.example.lab3_5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class SecondFragment: Fragment() {
    private lateinit var root: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreateView(inflater, container, savedInstanceState)
        root = inflater.inflate(R.layout.second_fragment, container, false)

        val toThirdButton = root.findViewById<Button>(R.id.toThird)
        toThirdButton.setOnClickListener {
            it.findNavController().navigate(
                R.id.second_to_third
            )
        }

        val toFirstButton = root.findViewById<Button>(R.id.toFirst)
        toFirstButton.setOnClickListener {
            it.findNavController().navigateUp()
        }

        return root
    }
}