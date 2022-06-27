package atomatis.derbylineup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import atomatis.derbylineup.databinding.ActivityMainBinding

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

        binding.newMatch.setOnClickListener {
            binding.root.context.startActivity(intent)
        }
    }
}
