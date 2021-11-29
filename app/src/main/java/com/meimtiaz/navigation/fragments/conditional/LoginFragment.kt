package com.meimtiaz.navigation.fragments.conditional

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.meimtiaz.navigation.databinding.FragmentABinding
import com.meimtiaz.navigation.databinding.FragmentBottomNavigationBinding
import com.meimtiaz.navigation.databinding.FragmentLoginFragmentBinding
import com.meimtiaz.navigation.fragments.HomeFragmentDirections

class LoginFragment : Fragment() {

    companion object {
        const val LOGIN_SUCCESSFUL: String = "LOGIN_SUCCESSFUL"
    }
    private val userViewModel: UserViewModel by activityViewModels()
    private lateinit var savedStateHandle: SavedStateHandle



    private var _binding: FragmentLoginFragmentBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginFragmentBinding.inflate(inflater, container, false)
        savedStateHandle = findNavController().previousBackStackEntry!!.savedStateHandle
        savedStateHandle.set(LOGIN_SUCCESSFUL, false)

        binding.backTV.setOnClickListener {
            requireActivity().finish()
        }


        return binding.root
    }

}
