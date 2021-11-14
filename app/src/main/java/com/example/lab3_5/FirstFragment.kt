package com.example.lab3_5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class FirstFragment: Fragment() {
    private lateinit var root: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreateView(inflater, container, savedInstanceState)
        root = inflater.inflate(R.layout.first_fragment, container, false)

        val toSecondButton = root.findViewById<Button>(R.id.bnToSecond)
        toSecondButton.setOnClickListener {
            it.findNavController().navigate(
                R.id.first_to_second
            )
        }
        return root
    }
}