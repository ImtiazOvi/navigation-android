package com.meimtiaz.navigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.meimtiaz.navigation.databinding.FragmentBottomNavigationBinding

class BottomNavigationFragment : Fragment() {

    private var _binding: FragmentBottomNavigationBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBottomNavigationBinding.inflate(inflater, container, false)

        binding.backTV.setOnClickListener {
            requireActivity().finish()
        }
        return binding.root
    }

}