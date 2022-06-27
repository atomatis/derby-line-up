package atomatis.derbylineup.entity

data class Team(
    val name: String
) {
    lateinit var blockers: Array<Player>
    lateinit var pivots: Array<Player>
    lateinit var jammers: Array<Player>
    lateinit var lines: Array<LinePool>
}
