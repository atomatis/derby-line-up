package atomatis.derbylineup.room.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import atomatis.derbylineup.room.entity.match.MatchWithJam

@Dao
interface MatchWithJamDao {
    @Transaction
    @Query("SELECT * FROM `match`")
    fun getUsersAndLibraries(): List<MatchWithJam>
}
