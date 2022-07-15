package atomatis.derbylineup.room.entity.match

import android.graphics.Color
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import atomatis.derbylineup.room.entity.Player
import atomatis.derbylineup.jam.WeightedInterface

@Entity
data class MatchPlayer(
    @PrimaryKey val id: Long,
    @Embedded val player: Player,
): WeightedInterface {
    private var jamPlayed: Int = 0
    var out = false
    var timePlayed = 0
    var jailed = false
    var color = Color.CYAN

    override fun getJamPlayed(): Int
    {
        return jamPlayed
    }

    override fun getPosition(): Int
    {
        TODO("Not yet implemented")
    }

    fun addJamPlayed(): MatchPlayer
    {
        jamPlayed++

        return this
    }
}
