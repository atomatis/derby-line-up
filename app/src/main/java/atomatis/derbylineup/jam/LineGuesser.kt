package atomatis.derbylineup.jam

import atomatis.derbylineup.entity.*

class LineGuesser(val jam: Jam)
{
    fun guessJamLine()
    {
        // 1 choose line
        jam.match.team.lines.sortBy{it.getJamPlayed()}
        jam.linePool = jam.match.team.lines[0]
        jam.linePool = jam.match.team.lines[0].addJamPlayed()
        // 2 jammer
        jam.match.team.jammers.sortBy{it.getJamPlayed()}
        jam.line.jammer = jam.match.team.jammers[0]
        jam.line.jammer = jam.match.team.jammers[0].addJamPlayed()

        // 3 pivot
        // 4 blockers
        jam.linePool.players.sortBy{it.getJamPlayed()}

        jam.line.pivot = jam.linePool.players[0]
        jam.line.blockerOne = jam.linePool.players[1]
        jam.line.blockerTwo = jam.linePool.players[2]
        jam.line.blockerThree = jam.linePool.players[3]

        jam.line.pivot = jam.linePool.players[0].addJamPlayed()
        jam.line.blockerOne = jam.linePool.players[1].addJamPlayed()
        jam.line.blockerTwo = jam.linePool.players[2].addJamPlayed()
        jam.line.blockerThree = jam.linePool.players[3].addJamPlayed()
    }
}
