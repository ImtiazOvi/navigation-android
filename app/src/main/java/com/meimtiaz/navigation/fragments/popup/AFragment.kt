package com.meimtiaz.navigation.fragments.popup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.meimtiaz.navigation.databinding.FragmentABinding
import com.meimtiaz.navigation.databinding.FragmentBottomNavigationBinding
import com.meimtiaz.navigation.fragments.HomeFragmentDirections

class AFragment : Fragment() {

    private var _binding: FragmentABinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentABinding.inflate(inflater, container, false)

        binding.backTV.setOnClickListener {
            requireActivity().finish()
        }
        binding.nextTv.setOnClickListener {
            findNavController().navigate(
                AFragmentDirections.
                actionAFragmentToBFragment()
            )
        }

        return binding.root
    }

}