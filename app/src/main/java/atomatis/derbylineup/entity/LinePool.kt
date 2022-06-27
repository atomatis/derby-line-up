package atomatis.derbylineup.entity

import atomatis.derbylineup.jam.WeightedInterface

data class LinePool(
    val number: Int
) : WeightedInterface {
    private var jamPlayed: Int = 0
    lateinit var players: Array<Player>
    lateinit var pivots: Array<Player>
    lateinit var secondaryPivots: Array<Player>

    override fun getJamPlayed(): Int
    {
        return jamPlayed
    }

    fun addJamPlayed(): LinePool
    {
        jamPlayed++

        return this
    }

    override fun getTimePlayed(): Long
    {
        return 0 // TODO?
    }
}
