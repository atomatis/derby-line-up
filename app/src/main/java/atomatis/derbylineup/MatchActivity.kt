package atomatis.derbylineup

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import atomatis.derbylineup.databinding.ActivityMatchBinding
import atomatis.derbylineup.entity.Line
import atomatis.derbylineup.entity.Match
import atomatis.derbylineup.entity.Player
import atomatis.derbylineup.entity.Team
import atomatis.derbylineup.jam.ChronometerManager

class MatchActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMatchBinding
    private lateinit var match: Match

    // On creation de l'activité
    override fun onCreate(savedInstanceState: Bundle?) {
        // Call parent method
        super.onCreate(savedInstanceState)
        binding = ActivityMatchBinding.inflate(layoutInflater)

        // Désigne le container principal.
        setContentView(binding.root)

        match = getMockData()

        match.addNewJam()
        match.addNewJam()
        match.addNewJam()

        ChronometerManager(binding)
    }

    private fun getMockData() : Match
    {
        val jess = Player("Jess")
        val sarah = Player("Sarah")
        val nao = Player("Nao")
        val barbi = Player("Barbi")
        val celine = Player("Celine")
        val lineOne = Line(
            arrayOf(jess),
            arrayOf(
                sarah,
                nao,
                barbi,
                celine,
            ),
            arrayOf()
        )
        val team = Team("Bloody skull")
        team.jammers = arrayOf(
            Player("Fury"),
            Player("Cri"),
            Player("Chiara"),
        )
        team.pivots = arrayOf(
            jess,
        )
        team.blockers = arrayOf(
            sarah,
            nao,
            barbi,
            celine,
        )
        team.lines = arrayOf(
            lineOne,
        )
        val match = Match("Bloody skull vs Canibal Marmot", team)

        return match
    }
}
