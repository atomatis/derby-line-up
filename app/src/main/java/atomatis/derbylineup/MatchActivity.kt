package atomatis.derbylineup

import android.graphics.Color
import android.os.Bundle
import android.view.DragEvent
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import atomatis.derbylineup.databinding.ActivityMatchBinding
import atomatis.derbylineup.entity.*
import atomatis.derbylineup.jam.ChainLineGuesser
import atomatis.derbylineup.jam.ChronometerManager
import atomatis.derbylineup.jam.Navigation

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
        match.jams[0].status = Jam.STATUS_ACTUAL

        val guesser = ChainLineGuesser()

        match.team.jammers[0].addJamPlayed()

        guesser.guessJams(match)
        ChronometerManager(binding)
        Navigation(binding, match)

        binding.matchTitle.text = match.getTitle()

        binding.testJail.setOnDragListener(fun (v, event): Boolean {
            Toast.makeText(this, "test drag listener", Toast.LENGTH_SHORT).show()

            return true
        })
    }

    private fun getMockData() : Match
    {
        val jess = Player(1, "Jess")
        jess.color = Color.YELLOW
        val sarah = Player(2, "Sarah")
        val nao = Player(3, "Nao")
        val barbi = Player(4, "Barbi")
        val celine = Player(5, "Celine")

        val fury = Player(6, "Fury")
        fury.color = Color.MAGENTA
        val cri = Player(7, "Cri")
        cri.color = Color.MAGENTA
        val chiara = Player(8, "Chiara")
        chiara.color = Color.MAGENTA

        val nolwen = Player(9, "Nolwen")
        nolwen.color = Color.YELLOW
        val cabri = Player(10, "Cabri")
        val flemme = Player(11, "Flemme")
        val deso = Player(12, "Deso")
        val moustique = Player(13, "Moustique")
        val lineOne = LinePool(1)
        lineOne.players = arrayOf(
            jess,
            sarah,
            nao,
            barbi,
            celine,
        )
        lineOne.pivots = arrayOf(jess)
        lineOne.secondaryPivots = arrayOf(celine)
        val lineTwo = LinePool(2)
        lineTwo.players = arrayOf(
            nolwen,
            cabri,
            flemme,
            deso,
            moustique,
        )
        lineTwo.pivots = arrayOf(nolwen)
        lineTwo.secondaryPivots = arrayOf(deso)
        val team = Team("Bloody skull")
        team.jammers = arrayOf(
            fury,
            cri,
            chiara,
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
            lineTwo,
        )

        return Match("Canibal Marmot", team)
    }
}
