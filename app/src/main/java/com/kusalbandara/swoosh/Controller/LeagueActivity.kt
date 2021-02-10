package com.kusalbandara.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.kusalbandara.swoosh.Utilities.EXTRA_LEAGUE
import com.kusalbandara.swoosh.databinding.ActivityLeagueBinding

class LeagueActivity : BasaeActivity() {
    private lateinit var binding: ActivityLeagueBinding
    var selectedLeague=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLeagueBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onMensClicked(view: View){
        binding.womensLeagueBtn.isChecked=false
        binding.coedLeagueBtn.isChecked=false
        selectedLeague="mens"
    }
    fun onWemensClicked(view: View){
        binding.mensLeagueBtn.isChecked=false
        binding.coedLeagueBtn.isChecked=false
        selectedLeague="womens"
    }
    fun onCoedClicked(view: View){
        binding.mensLeagueBtn.isChecked=false
        binding.womensLeagueBtn.isChecked=false
        selectedLeague="co-ed"
    }

    fun leagueNextClicked(view:View){
        if (selectedLeague!=""){
            val skillActivity= Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE,selectedLeague)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this,"Please select a league.",Toast.LENGTH_SHORT).show()
        }
    }

}