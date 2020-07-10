package com.prongbang.profile

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_profile)
	}

	companion object {
		fun navigate(context: Context) {
			context.startActivity(Intent(context, ProfileActivity::class.java))
		}
	}
}