package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Utils.EXTRA_LEAGUE
import com.example.swoosh.R
import com.example.swoosh.Utils.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skillSelected = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onClickBeginner(view: View) {
        BtnBaller.isChecked = false
        skillSelected = "Beginner"
    }

    fun onClickBaller(view: View) {
        BtnBeginner.isChecked = false
        skillSelected = "Baller"
    }

    fun onClickSkillFinish(view: View) {
        if (skillSelected != "") {
            var finishSkillIntent = Intent(this, FinishActivity::class.java)
            finishSkillIntent.putExtra(EXTRA_SKILL, skillSelected)
            finishSkillIntent.putExtra(EXTRA_LEAGUE, league)
            startActivity(finishSkillIntent)
        } else {
            Toast.makeText(this, "Please select a skill!", Toast.LENGTH_SHORT).show()
        }
    }
}
