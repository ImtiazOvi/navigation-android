package com.meimtiaz.navigation.utils

import android.app.Activity
import android.content.Intent
import com.meimtiaz.navigation.activities.DashboardNavHostActivity


fun Activity.navigateDashboardActivity() {
    startActivity(
        Intent(this, DashboardNavHostActivity::class.java)
    )
}


