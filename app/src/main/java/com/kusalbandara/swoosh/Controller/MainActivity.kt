package com.kusalbandara.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.kusalbandara.swoosh.databinding.ActivityMainBinding


class MainActivity : BasaeActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.getStartedBtn.setOnClickListener {
            val leagueIntent= Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }

    }
}