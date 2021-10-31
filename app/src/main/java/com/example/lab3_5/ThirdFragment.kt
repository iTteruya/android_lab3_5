package com.example.lab3_5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class ThirdFragment: Fragment() {
    private lateinit var root: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreateView(inflater, container, savedInstanceState)
        root = inflater.inflate(R.layout.third_fragment, container, false)

        val toSecondButton = root.findViewById<Button>(R.id.toSecond)
        toSecondButton.setOnClickListener {
            it.findNavController().navigateUp()
        }

        val toFirstButton = root.findViewById<Button>(R.id.toFirst)
        toFirstButton.setOnClickListener {
            it.findNavController().popBackStack(R.id.firstFrag, false)
        }

        return root
    }
}