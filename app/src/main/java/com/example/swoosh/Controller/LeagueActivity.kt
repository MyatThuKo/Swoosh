package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.Utils.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("", "")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
        }
    }

    fun onClickHandler(view: View) {

        if (player.league != "") {
            val nextIntent = Intent(this, SkillActivity::class.java)
            nextIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(nextIntent)
        } else {
            Toast.makeText(this, "Please select the league to join!", Toast.LENGTH_SHORT).show()
        }
    }

    fun onClickMen(view: View) {
        BtnWomenLeague.isChecked = false
        BtnCoEd.isChecked = false

        player.league = "Men\'s"
    }

    fun onClickWomen(view: View) {
        BtnMensLeague.isChecked = false
        BtnCoEd.isChecked = false

        player.league = "Women\'s"
    }

    fun onClickCoEd(view: View) {
        BtnMensLeague.isChecked = false
        BtnWomenLeague.isChecked = false

        player.league = "Co-Ed\'"
    }
}
