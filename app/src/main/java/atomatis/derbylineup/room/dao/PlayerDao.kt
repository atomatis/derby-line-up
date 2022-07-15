package atomatis.derbylineup.room.dao

import androidx.room.Dao
import androidx.room.Insert
import atomatis.derbylineup.room.entity.Player
import com.example.android.db.BaseDao

@Dao
interface PlayerDao : BaseDao<Player> {
}
