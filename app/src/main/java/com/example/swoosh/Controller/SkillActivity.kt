package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.Utils.EXTRA_PLAYER
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun onClickBeginner(view: View) {
        BtnBaller.isChecked = false
        player.skill = "Beginner"
    }

    fun onClickBaller(view: View) {
        BtnBeginner.isChecked = false
        player.skill = "Baller"
    }

    fun onClickSkillFinish(view: View) {
        if (player.skill != "") {
            var finishSkillIntent = Intent(this, FinishActivity::class.java)
            finishSkillIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(finishSkillIntent)
        } else {
            Toast.makeText(this, "Please select a skill!", Toast.LENGTH_SHORT).show()
        }
    }
}
