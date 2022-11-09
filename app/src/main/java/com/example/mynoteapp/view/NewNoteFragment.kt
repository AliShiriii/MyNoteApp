package com.example.mynoteapp.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mynoteapp.databinding.FragmentNewNoteBinding
import com.example.repository.Utils.showToast
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.*

@AndroidEntryPoint
class NewNoteFragment : Fragment() {

    private var _binding: FragmentNewNoteBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment

        _binding = FragmentNewNoteBinding.inflate(inflater, container, false)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        goTomeFragment()
        setDate()
        saveNote()

    }

    private fun setDate(){

        val simpleDateFormat = SimpleDateFormat("dd/m/yyy hh:mm:ss")
        val currentDate = simpleDateFormat.format(Date())

        binding.notesDateTime.text = currentDate
    }

    private fun saveNote(){

        binding.imageDone.setOnClickListener {

            if (binding.notesTitle.text == null){
                showToast(requireContext(), "Title Required")
            }
            if (binding.notesSubTitle.text == null){
                showToast(requireContext(), "Sub Title Required")
            }
            if (binding.notesDescription.text == null){

                showToast(requireContext(), "Note description must not be null")

            }

        }

    }

    private fun goTomeFragment(){

        findNavController().navigate(NewNoteFragmentDirections.actionNewNoteFragmentToHomeFragment())

    }
}