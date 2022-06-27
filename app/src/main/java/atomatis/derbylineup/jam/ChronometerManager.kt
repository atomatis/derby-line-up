package atomatis.derbylineup.jam

import atomatis.derbylineup.R
import android.os.SystemClock
import android.view.View
import atomatis.derbylineup.databinding.ActivityMatchBinding

class ChronometerManager(
    private val binding: ActivityMatchBinding
) {
    private var pause = false
    // Needed for pause, else, time still running out.
    private var timeWhenStopped : Long = 0

    // Set onclick listeners
    init {
        binding.startMatchButton.setOnClickListener {beginMatch()}
        binding.endMatchButton.setOnClickListener {endMatch()}
        binding.startJamButton.setOnClickListener {startJam()}
        binding.endJamButton.setOnClickListener {endJam()}
        binding.pauseJamButton.setOnClickListener {
            if (pause) unpauseJam() else pauseJam()
        }
    }

    fun beginMatch()
    {
        binding.startMatchButton.visibility = View.INVISIBLE
        binding.matchChronometer.base = SystemClock.elapsedRealtime()
        binding.matchChronometer.start()
        startJam()
    }

    fun endMatch()
    {
        binding.matchChronometer.stop()
    }

    fun startJam()
    {
        showEndJamButtons()
        binding.jamChronometer.base = SystemClock.elapsedRealtime()
        binding.jamChronometer.start()
    }

    fun endJam()
    {
        showStartJamButtons()
        binding.pauseJamButton.setText(R.string.pause_jam_button)
        pause = false
        timeWhenStopped = 0
        binding.jamChronometer.stop()
    }

    fun pauseJam()
    {
        binding.pauseJamButton.setText(R.string.unpause_jam_button)
        pause = true
        binding.jamChronometer.stop()
        timeWhenStopped = binding.jamChronometer.base - SystemClock.elapsedRealtime()
    }

    fun unpauseJam()
    {
        binding.pauseJamButton.setText(R.string.pause_jam_button)
        pause = false
        binding.jamChronometer.base = SystemClock.elapsedRealtime() + timeWhenStopped
        binding.jamChronometer.start()
    }

    private fun cleanButtons()
    {
        binding.startJamButton.visibility = View.INVISIBLE
        binding.endMatchButton.visibility = View.INVISIBLE
        binding.startJamButton.visibility = View.INVISIBLE
        binding.endJamButton.visibility = View.INVISIBLE
        binding.pauseJamButton.visibility = View.INVISIBLE
    }

    private fun showStartJamButtons()
    {
        cleanButtons()
        binding.startJamButton.visibility = View.VISIBLE
        binding.endMatchButton.visibility = View.VISIBLE
    }

    private fun showEndJamButtons()
    {
        cleanButtons()
        binding.endJamButton.visibility = View.VISIBLE
        binding.pauseJamButton.visibility = View.VISIBLE
    }
}
