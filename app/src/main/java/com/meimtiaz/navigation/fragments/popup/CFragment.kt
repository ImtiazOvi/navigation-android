package com.meimtiaz.navigation.fragments.popup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.meimtiaz.navigation.databinding.FragmentCBinding

class CFragment : Fragment() {

    private var _binding: FragmentCBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCBinding.inflate(inflater, container, false)

        binding.backTV.setOnClickListener {
            findNavController().popBackStack()
        }
        binding.nextTv.setOnClickListener {
            findNavController().navigate(
                CFragmentDirections.
                actionCFragmentToAFragment()
            )
        }

        return binding.root
    }

}