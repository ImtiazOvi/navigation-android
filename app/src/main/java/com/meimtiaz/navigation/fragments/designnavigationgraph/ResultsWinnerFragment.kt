package com.meimtiaz.navigation.fragments.designnavigationgraph

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.meimtiaz.navigation.databinding.FragmentResultsWinnerBinding

class ResultsWinnerFragment : Fragment() {

    private var _binding: FragmentResultsWinnerBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentResultsWinnerBinding.inflate(inflater, container, false)

        binding.backTV.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.nextTv.setOnClickListener {
            findNavController().navigate(ResultsWinnerFragmentDirections.actionResultsWinnerFragmentToInGameFragment())
        }


        return binding.root
    }

}