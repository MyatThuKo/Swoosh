package com.example.swoosh.Controller

import android.os.Bundle
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.Utils.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeagueText.setText("Looking for ${player.league} League and ${player.skill} Skill near you....")
    }
}
