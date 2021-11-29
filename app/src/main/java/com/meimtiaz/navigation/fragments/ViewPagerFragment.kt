package com.meimtiaz.navigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.meimtiaz.navigation.databinding.FragmentViewpagerBinding

class ViewPagerFragment : Fragment() {

    private var _binding: FragmentViewpagerBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentViewpagerBinding.inflate(inflater, container, false)

        binding.backTV.setOnClickListener {
            findNavController().popBackStack()
        }
        return binding.root
    }

}