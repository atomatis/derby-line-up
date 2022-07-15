package atomatis.derbylineup.room.entity

data class LinePool(
    val number: Int
) {
    lateinit var players: Array<Player>
    lateinit var pivots: Array<Player>
    lateinit var secondaryPivots: Array<Player>
}
