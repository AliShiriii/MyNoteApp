package com.example.mynoteapp.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mynoteapp.databinding.FragmentNewNoteBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NewNoteFragment : Fragment() {

    private var _binding: FragmentNewNoteBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentNewNoteBinding.inflate(inflater, container, false)

        return binding?.root

    }
}