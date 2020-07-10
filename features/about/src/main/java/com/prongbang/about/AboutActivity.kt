package com.prongbang.about

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_about)
	}

	companion object {
		fun navigate(context: Context) {
			context.startActivity(Intent(context, AboutActivity::class.java))
		}
	}
}