package com.meimtiaz.navigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.meimtiaz.navigation.databinding.FragmentHomeBinding
import com.meimtiaz.navigation.utils.navigateConditionalNavHostActivity
import com.meimtiaz.navigation.utils.navigateDesignNavigationNavHostActivity
import com.meimtiaz.navigation.utils.navigatePopUpNavHostActivity

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.backTV.setOnClickListener {
            requireActivity().finish()
        }

        binding.globalActionBtn.setOnClickListener {
            findNavController().navigate(RegistrationFragmentDirections.actionRegistrationFragment())
        }

        binding.popUpToBtn.setOnClickListener {
            requireActivity().navigatePopUpNavHostActivity()
        }

        binding.conditionalScreenBtn.setOnClickListener {
            requireActivity().navigateConditionalNavHostActivity()
        }

        binding.designNavigationBtn.setOnClickListener {
            requireActivity().navigateDesignNavigationNavHostActivity()
        }

        binding.navigateNavigationDrawerBtn.setOnClickListener {
            findNavController().navigate(
                HomeFragmentDirections.
                actionHomeFragmentToNavigationDrawerFragment()
            )
        }

        binding.navigateBottomNavigationBtn.setOnClickListener {
            findNavController().navigate(
                HomeFragmentDirections.
                actionHomeFragmentToBottomNavigationFragment()
            )
        }

        binding.navigateViewPagerBtn.setOnClickListener {
            findNavController().navigate(
                HomeFragmentDirections.
                actionHomeFragmentToViewPagerFragment()
            )
        }

        binding.navigateArgumentPassBtn.setOnClickListener {
            findNavController().navigate(
                HomeFragmentDirections.
                actionHomeFragmentToArgumentFragment("Md Imtiaz Uddin")
            )
        }

        return binding.root
    }

}