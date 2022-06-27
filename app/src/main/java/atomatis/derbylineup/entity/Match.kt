package atomatis.derbylineup.entity

import java.util.*

data class Match (
    val name : String,
    val team : Team
) {
    lateinit var startAt : Date
    lateinit var endAt : Date
    lateinit var jams : Array<Jam>

    fun addNewJam()
    {
        jams += Jam(this, jams.count() + 1)
    }

    fun getJamByNumber(number: Int): Jam?
    {
        return jams.getOrNull(number - 1)
    }
}
