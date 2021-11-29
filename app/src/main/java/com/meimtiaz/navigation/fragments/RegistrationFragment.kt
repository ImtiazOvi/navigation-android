package com.meimtiaz.navigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.meimtiaz.navigation.databinding.FragmentRegistrationBinding
import com.meimtiaz.navigation.utils.navigateDashboardActivity

class RegistrationFragment : Fragment() {

    private var _binding: FragmentRegistrationBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRegistrationBinding.inflate(inflater, container, false)

        binding.submitBtn.setOnClickListener {
            requireActivity().navigateDashboardActivity()
        }

        return binding.root
    }

}