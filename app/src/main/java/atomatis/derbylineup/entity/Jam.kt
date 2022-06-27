package atomatis.derbylineup.entity

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

    var status : String = STATUS_COMING
    var duration : Int = 0
    var line: Line = Line()
    lateinit var linePool : LinePool
    lateinit var startAt : Date
}
