package atomatis.derbylineup.entity

class Line {
    var jammer : Player? = null
    var pivot : Player? = null
    var blockerOne : Player? = null
    var blockerTwo : Player? = null
    var blockerThree : Player? = null

    // Check if player is in Already in play.
    fun inPlay(player: Player): Boolean
    {
        arrayOf(jammer, pivot, blockerOne, blockerTwo, blockerThree).forEach {
            if (it === player) {
                return true
            }
        }

        return false
    }
}
