package atomatis.derbylineup.entity

data class Player (
    val name: String
) {
    var timePlayed: Int = 0
    var jamPlayed: Int = 0
    var fixed: Boolean = false
    var jailed: Boolean = false
    var out: Boolean = false
}
