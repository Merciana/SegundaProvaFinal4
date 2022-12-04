package com.example.segundaprovafinal4.ui.sobre

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.segundaprovafinal4.R
import com.example.segundaprovafinal4.databinding.FragmentSobreBinding

class SobreFragment : Fragment() {
    private lateinit var binding: FragmentSobreBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSobreBinding.inflate(inflater, container, false)
        val root : View = binding.root

        return root
    }

}