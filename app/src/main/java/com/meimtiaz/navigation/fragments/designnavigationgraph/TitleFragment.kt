package com.meimtiaz.navigation.fragments.designnavigationgraph

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.meimtiaz.navigation.databinding.FragmentGameTitleBinding

class TitleFragment : Fragment() {

    private var _binding: FragmentGameTitleBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGameTitleBinding.inflate(inflater, container, false)

        binding.backTV.setOnClickListener {
            requireActivity().finish()
        }

        binding.nextTv.setOnClickListener {
           findNavController().navigate(TitleFragmentDirections.actionTitleFragmentToRegisterFragment())
        }


        return binding.root
    }

}