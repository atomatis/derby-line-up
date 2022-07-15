package atomatis.derbylineup.room.entity

import androidx.room.Entity

@Entity
data class Team(
    val name: String
) {
    lateinit var blockers: Array<Player>
    lateinit var pivots: Array<Player>
    lateinit var jammers: Array<Player>
    lateinit var lines: Array<LinePool>
}
