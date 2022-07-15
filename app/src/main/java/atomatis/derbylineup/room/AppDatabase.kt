package atomatis.derbylineup.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import atomatis.derbylineup.room.dao.MatchDao
import atomatis.derbylineup.room.dao.PlayerDao
import atomatis.derbylineup.room.entity.Player
import atomatis.derbylineup.room.entity.match.Match

@Database(entities = [
    Match::class,
    Player::class,
], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun matchDao(): MatchDao
    abstract fun playerDao(): PlayerDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null
        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                ).fallbackToDestructiveMigration().build()
                INSTANCE = instance

                return instance
            }
        }
    }
}
