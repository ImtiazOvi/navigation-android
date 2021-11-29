package com.meimtiaz.navigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.meimtiaz.navigation.databinding.FragmentBottomNavigationBinding

class ArgumentFragment : Fragment() {

    private var _binding: FragmentBottomNavigationBinding? = null
    private val binding get() = _binding!!
    private val args by navArgs<ArgumentFragmentArgs>()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBottomNavigationBinding.inflate(inflater, container, false)

        print(args.name)

        binding.backTV.setOnClickListener {
            findNavController().popBackStack()
        }
        return binding.root
    }

}