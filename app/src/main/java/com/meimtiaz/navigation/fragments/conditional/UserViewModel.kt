package com.meimtiaz.navigation.fragments.conditional

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.meimtiaz.navigation.utils.AbsentLiveData

class UserViewModel: ViewModel() {

    val user = MutableLiveData<String>()

//     fun observeUser(phone:String):LiveData<String>{
//         when {
//             phone.isEmpty() -> AbsentLiveData.c
//             else -> phone
//
//         }
//
//     }

}