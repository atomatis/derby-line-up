package atomatis.derbylineup.room.entity.match

import atomatis.derbylineup.room.entity.Player
import java.util.*

data class Jam(
    val match: Match,
    val number : Int
) {
    companion object{
        const val STATUS_DONE = "done"
        const val STATUS_ACTUAL = "actual"
        const val STATUS_COMING = "coming"
    }

    var jammer : Player? = null
    var pivot : Player? = null
    var blockerOne : Player? = null
    var blockerTwo : Player? = null
    var blockerThree : Player? = null

    var status : String = STATUS_COMING
    var duration : Int = 0
    lateinit var startAt : Date
}
