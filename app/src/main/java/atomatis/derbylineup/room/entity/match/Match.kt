package atomatis.derbylineup.room.entity.match

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Match (
    @PrimaryKey val id: Long,
    val title : String,
) {
    var startAt: Long = 0 // Todo Date converter
    var endAt: Long = 0 // Todo Date converter
    @Ignore var jams : Array<Jam> = arrayOf()

    fun addNewJam()
    {
        jams += Jam(this, jams.count() + 1)
    }

    fun getJamByNumber(number: Int): Jam?
    {
        return jams.getOrNull(number - 1)
    }
}
