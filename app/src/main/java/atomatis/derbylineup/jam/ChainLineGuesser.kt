package atomatis.derbylineup.jam

import atomatis.derbylineup.room.entity.match.*

class ChainLineGuesser {
    fun guessJams(match: Match)
    {
        match.jams.forEach lit@ {
            if (it.status === Jam.STATUS_DONE) return@lit // continue
            val lineGuesser = LineGuesser(it)
//            lineGuesser.guessJamLine()
        }
    }
}
