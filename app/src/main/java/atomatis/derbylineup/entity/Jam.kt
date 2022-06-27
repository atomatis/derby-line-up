package atomatis.derbylineup.entity

import java.util.*

data class Jam(
    val match: Match,
    val number : Int
) {
    var duration : Int = 0
    lateinit var jammer : Player
    lateinit var pivot : Player
    lateinit var blockerOne : Player
    lateinit var blockerTwo : Player
    lateinit var blockerThree : Player
    lateinit var startAt : Date
}
