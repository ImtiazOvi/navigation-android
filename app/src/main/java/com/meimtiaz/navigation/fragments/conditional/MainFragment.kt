package com.meimtiaz.navigation.fragments.conditional

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.meimtiaz.navigation.databinding.FragmentABinding
import com.meimtiaz.navigation.databinding.FragmentMainFragmentBinding

class MainFragment: Fragment() {
    private var _binding: FragmentMainFragmentBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainFragmentBinding.inflate(inflater, container, false)

        binding.backTV.setOnClickListener {
            requireActivity().finish()
        }

        binding.navigateProfileTV.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToUserProfileFragment())
        }


        return binding.root
    }
}