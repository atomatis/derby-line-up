package atomatis.derbylineup.jam

import atomatis.derbylineup.room.entity.*
import atomatis.derbylineup.room.entity.match.*

class LineGuesser(val jam: Jam)
{
//    fun guessJamLine()
//    {
//        val Sorter = Sorter()
//
//        // 1 choose line
//        jam.match.team.lines.sortBy{it.getJamPlayed()}
//        jam.linePool = jam.match.team.lines[0]
//        jam.linePool.addJamPlayed()
//
//        // 2 jammer
//        jam.match.team.jammers = Sorter.sort(jam.match.team.jammers)
//        jam.line.jammer = jam.match.team.jammers[0]
//        jam.line.jammer!!.addJamPlayed()
//
//        // 3 pivot
//        jam.linePool.players.sortBy{it.getJamPlayed()}
//        jam.line.pivot = guessPivot()
//        jam.line.pivot!!.addJamPlayed()
//
//        // 4 blockers
//        jam.line.blockerOne = guessBlocker()
//        jam.line.blockerOne!!.addJamPlayed()
//        jam.line.blockerTwo = guessBlocker()
//        jam.line.blockerTwo!!.addJamPlayed()
//        jam.line.blockerThree = guessBlocker()
//        jam.line.blockerThree!!.addJamPlayed()
//    }
//
//    private fun guessPivot(): Player
//    {
//        var pivot: Player? = null
//
//        // Check pivot in 4 firsts
//        for (i in 0..3) {
//            if (null !== pivot) break
//
//            val player = jam.linePool.players[i]
//
//            if (jam.line.inPlay(player)) continue
//
//            if (player in jam.linePool.pivots) {
//                pivot = player
//            }
//        }
//
//        // Check secondary pivot in 4 firsts
//        for (i in 0..3) {
//            if (null !== pivot) break
//
//            val player = jam.linePool.players[i]
//
//            if (jam.line.inPlay(player)) continue
//
//            if (player in jam.linePool.secondaryPivots) {
//                pivot = player
//            }
//        }
//
//        if (null === pivot) {
//            throw Exception()
//        }
//
//        return pivot
//    }
//
//    private fun guessBlocker(): Player
//    {
//        var blocker: Player? = null
//
//        for (i in 0..jam.linePool.players.size) {
//            if (null !== blocker) break
//            if (jam.line.inPlay(jam.linePool.players[i])) continue
//
//            blocker = jam.linePool.players[i]
//        }
//
//        if (null === blocker) {
//            throw Exception()
//        }
//
//        return blocker
//    }
}
