package com.kusalbandara.swoosh.Controller

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kusalbandara.swoosh.R
import com.kusalbandara.swoosh.Utilities.EXTRA_LEAGUE
import com.kusalbandara.swoosh.Utilities.EXTRA_SKILL
import com.kusalbandara.swoosh.databinding.ActivityFinishBinding

class FinishActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFinishBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityFinishBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val league=intent.getStringExtra(EXTRA_LEAGUE).toString()
        val skill=intent.getStringExtra(EXTRA_SKILL).toString()
        binding.SearchLeagueTxt.text="Looking for $league $skill league near you"
    }
}