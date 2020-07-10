package com.prongbang.dashboard

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_dashboard)
	}

	companion object {
		fun navigate(context: Context) {
			context.startActivity(Intent(context, DashboardActivity::class.java))
		}
	}
}