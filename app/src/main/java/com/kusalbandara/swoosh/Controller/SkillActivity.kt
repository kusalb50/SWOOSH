package com.kusalbandara.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.kusalbandara.swoosh.Utilities.EXTRA_LEAGUE
import com.kusalbandara.swoosh.R
import com.kusalbandara.swoosh.Utilities.EXTRA_SKILL
import com.kusalbandara.swoosh.databinding.ActivitySkillBinding

class SkillActivity : BasaeActivity() {
    private lateinit var binding: ActivitySkillBinding
    var league=""
    var selectedSkill=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySkillBinding.inflate(layoutInflater)
        setContentView(binding.root)
        league=intent.getStringExtra(EXTRA_LEAGUE).toString()
    }
    fun onBeginnerClicked(view: View){binding.ballerSkillBtn.isChecked=false
    selectedSkill="beginner"}
    fun onBallerClicked(view: View){binding.beginnerSkillBtn.isChecked=false
    selectedSkill="baller"}
    fun onFinishClicked(view: View){
        if (selectedSkill!=""){val finishActivity= Intent(this,FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE,league)
            finishActivity.putExtra(EXTRA_SKILL,selectedSkill)
            startActivity(finishActivity)}
        else{
            Toast.makeText(this,"Please select a Skill.",Toast.LENGTH_SHORT).show()}
    }


}