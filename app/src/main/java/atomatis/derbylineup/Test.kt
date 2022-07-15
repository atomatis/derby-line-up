package atomatis.derbylineup

import kotlinx.coroutines.Dispatchers

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import atomatis.derbylineup.room.dao.PlayerDao
import atomatis.derbylineup.room.entity.Player
import kotlinx.coroutines.launch

class Test(val dao: PlayerDao): ViewModel() {

    fun test() {
        viewModelScope.launch(Dispatchers.IO) {
            val player = Player(name="Jess")
            dao.insert(player)
        }
    }
}
