package com.example.segundaprovafinal4.ui.detalhe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.segundaprovafinal4.R
import com.example.segundaprovafinal4.databinding.FragmentDetalheBinding

class DetalheFragment : Fragment() {
    private lateinit var binding : FragmentDetalheBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetalheBinding.inflate(inflater, container, false)
        val root : View = binding.root

        return root
    }

}