package atomatis.derbylineup.room.dao

import androidx.room.Dao
import androidx.room.Query
import atomatis.derbylineup.room.entity.match.Match

@Dao
interface MatchDao {
    @Query("SELECT * FROM `match`")
    fun getAll(): List<Match>
}
