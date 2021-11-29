package com.meimtiaz.navigation.fragments.conditional

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.meimtiaz.navigation.R
import com.meimtiaz.navigation.databinding.FragmentABinding
import com.meimtiaz.navigation.databinding.FragmentBottomNavigationBinding
import com.meimtiaz.navigation.databinding.FragmentUserProfileFragmentBinding
import com.meimtiaz.navigation.fragments.HomeFragmentDirections

class UserProfileFragment : Fragment() {

    private var _binding: FragmentUserProfileFragmentBinding? = null
    private val binding get() = _binding!!
    private val userViewModel: UserViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentUserProfileFragmentBinding.inflate(inflater, container, false)

        binding.backTV.setOnClickListener {
            requireActivity().finish()
        }

//        userViewModel.userPhone.observe(viewLifecycleOwner, { phone ->
//            if (phone.isNullOrEmpty()) {
//                Toast.makeText(requireContext(),"Welcome", Toast.LENGTH_SHORT).show()
//            } else {
//                findNavController().navigate(R.id.loginFragment)
//            }
//
//        })

        findNavController().navigate(R.id.loginFragment)

        return binding.root
    }

}