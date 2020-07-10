package com.prongbang.modular

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.prongbang.about.AboutActivity
import com.prongbang.dashboard.DashboardActivity
import com.prongbang.profile.ProfileActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		initListener()
	}

	private fun initListener() {
		aboutButton.setOnClickListener {
			AboutActivity.navigate(this)
		}

		dashboardButton.setOnClickListener {
			DashboardActivity.navigate(this)
		}

		profileButton.setOnClickListener {
			ProfileActivity.navigate(this)
		}
	}
}