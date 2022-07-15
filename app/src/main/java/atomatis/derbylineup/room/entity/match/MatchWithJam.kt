package atomatis.derbylineup.room.entity.match

import androidx.room.Embedded
import androidx.room.Relation

data class MatchWithJam(
    @Embedded val match: Match,
    @Relation(
        parentColumn = "id",
        entityColumn = "id"
    )
    val jams: List<Jam>
)
