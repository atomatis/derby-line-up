package atomatis.derbylineup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModel
import atomatis.derbylineup.databinding.ActivityMainBinding
import atomatis.derbylineup.room.AppDatabase
import atomatis.derbylineup.room.entity.Player

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    // On creation de l'activité
    override fun onCreate(savedInstanceState: Bundle?) {
        // Call parent method
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        // Désigne le container principal.
        setContentView(binding.root)

        val intent = Intent(binding.root.context, MatchActivity::class.java)

        val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }

        binding.newMatch.setOnClickListener {


            val test = Test(database.playerDao())

            test.test()

            println("Hello world!")

//            binding.root.context.startActivity(intent)
        }


    }
}
