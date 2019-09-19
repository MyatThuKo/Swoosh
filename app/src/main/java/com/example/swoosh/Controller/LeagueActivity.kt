package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Utils.EXTRA_LEAGUE
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onClickHandler(view: View) {

        if (selectedLeague != "") {
            val nextIntent = Intent(this, SkillActivity::class.java)
            nextIntent.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(nextIntent)
        } else {
            Toast.makeText(this, "Please select the league to join!", Toast.LENGTH_SHORT).show()
        }
    }

    fun onClickMen(view: View) {
        BtnWomenLeague.isChecked = false
        BtnCoEd.isChecked = false

        selectedLeague = "Men\'s"
    }

    fun onClickWomen(view: View) {
        BtnMensLeague.isChecked = false
        BtnCoEd.isChecked = false

        selectedLeague = "Women\'s"
    }

    fun onClickCoEd(view: View) {
        BtnMensLeague.isChecked = false
        BtnWomenLeague.isChecked = false

        selectedLeague = "Co-Ed\'"
    }
}
