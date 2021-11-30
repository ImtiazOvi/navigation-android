package com.meimtiaz.navigation.fragments.designnavigationgraph

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.meimtiaz.navigation.databinding.FragmentInGameBinding

class InGameFragment : Fragment() {

    private var _binding: FragmentInGameBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentInGameBinding.inflate(inflater, container, false)

        binding.backTV.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.failTv.setOnClickListener {
            findNavController().navigate(InGameFragmentDirections.actionInGameFragmentToGameOverFragment())
        }

        binding.winTv.setOnClickListener {
            findNavController().navigate(InGameFragmentDirections.actionInGameFragmentToResultsWinnerFragment())
        }



        return binding.root
    }

}