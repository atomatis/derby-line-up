package atomatis.derbylineup.entity

import java.util.*

data class Match (
    val versusTeam : String,
    val team : Team
) {
    lateinit var startAt : Date
    lateinit var endAt : Date
    var jams : Array<Jam> = arrayOf()

    fun getTitle(): String
    {
        val teamName = team.name
        return "$teamName VS $versusTeam"
    }

    fun addNewJam()
    {
        jams += Jam(this, jams.count() + 1)
    }

    fun getJamByNumber(number: Int): Jam?
    {
        return jams.getOrNull(number - 1)
    }
}
