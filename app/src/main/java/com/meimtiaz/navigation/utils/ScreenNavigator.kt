package com.meimtiaz.navigation.utils

import android.app.Activity
import android.content.Intent
import com.meimtiaz.navigation.activities.ConditionalNavHostActivity
import com.meimtiaz.navigation.activities.DashboardNavHostActivity
import com.meimtiaz.navigation.activities.PopUpNavHostActivity


fun Activity.navigateDashboardActivity() {
    startActivity(
        Intent(this, DashboardNavHostActivity::class.java)
    )
}
fun Activity.navigatePopUpNavHostActivity() {
    startActivity(
        Intent(this, PopUpNavHostActivity::class.java)
    )
}

fun Activity.navigateConditionalNavHostActivity() {
    startActivity(
        Intent(this, ConditionalNavHostActivity::class.java)
    )
}


