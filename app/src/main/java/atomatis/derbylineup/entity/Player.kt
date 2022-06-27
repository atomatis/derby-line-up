package atomatis.derbylineup.entity

import android.graphics.Color
import atomatis.derbylineup.jam.WeightedInterface

data class Player (
    val id: Int,
    val name: String
) : WeightedInterface {
    private var jamPlayed: Int = 0
    var timePlayed: Int = 0
    var fixed: Boolean = false
    var jailed: Boolean = false
    var out: Boolean = false
    var color: Int = Color.CYAN

    override fun getJamPlayed(): Int
    {
        return jamPlayed
    }

    fun addJamPlayed(): Player
    {
        jamPlayed++

        return this
    }

    override fun getTimePlayed(): Long
    {
        TODO("Not yet implemented")
    }
}
