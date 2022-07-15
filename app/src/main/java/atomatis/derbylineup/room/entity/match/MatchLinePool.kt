package atomatis.derbylineup.room.entity.match

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MatchLinePool(
    @PrimaryKey val id: Long,
) {
    lateinit var players: Array<MatchPlayer>
    lateinit var pivots: Array<MatchPlayer>
    lateinit var secondaryPivots: Array<MatchPlayer>
}
