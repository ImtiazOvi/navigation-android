package com.meimtiaz.navigation.fragments.popup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.meimtiaz.navigation.databinding.FragmentBBinding

class BFragment : Fragment() {

    private var _binding: FragmentBBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBBinding.inflate(inflater, container, false)

        binding.backTV.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.nextTv.setOnClickListener {
            findNavController().navigate(
                BFragmentDirections.
                actionBFragmentToCFragment()
            )
        }

        return binding.root
    }

}