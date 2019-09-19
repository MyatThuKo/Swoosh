package com.example.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View

class LeagueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onClickHandler(view: View) {
        val nextIntent = Intent(this, SkillActivity::class.java)
        startActivity(nextIntent)
    }
}
