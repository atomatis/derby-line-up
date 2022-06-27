package atomatis.derbylineup.jam

import atomatis.derbylineup.databinding.ActivityMatchBinding
import atomatis.derbylineup.entity.Jam
import atomatis.derbylineup.entity.Match

class Navigation(
    private val binding: ActivityMatchBinding,
    private val match: Match
) {
    lateinit var actual: Jam
    var position: Int = 0

    init {
        // Always init view with actual jam
        match.jams.forEach {
            if (Jam.STATUS_ACTUAL === it.status) {
                actual = it
            }
        }

        binding.previousJamButton.setOnClickListener {showPrevious()}
//        binding.previousJamButton.setOnLongClickListener {
//            showActual()
//            return@setOnLongClickListener true
//        }
        binding.actualJamButton.setOnClickListener {showActual()}
        binding.nextJamButton.setOnClickListener {showNext()}

        showActual()
    }

    private fun show(jam: Jam)
    {
        binding.status.text = jam.status
        binding.jammer.text = jam.line.jammer?.name ?: "missing player"
        binding.pivot.text = jam.line.pivot?.name ?: "missing player"
        binding.blockOne.text = jam.line.blockerOne?.name ?: "missing player"
        binding.blockTwo.text = jam.line.blockerTwo?.name ?: "missing player"
        binding.blockThree.text = jam.line.blockerThree?.name ?: "missing player"

        binding.jammer.setBackgroundColor(jam.line.jammer?.color ?: 0)
        binding.pivot.setBackgroundColor(jam.line.pivot?.color ?: 0)
        binding.blockOne.setBackgroundColor(jam.line.blockerOne?.color ?: 0)
        binding.blockTwo.setBackgroundColor(jam.line.blockerTwo?.color ?: 0)
        binding.blockThree.setBackgroundColor(jam.line.blockerThree?.color ?: 0)
    }

    private fun showPrevious()
    {
        // safety
        if (position == 0) return

        val previous = match.jams[position - 1]
        show(previous)
        position--
    }

    private fun showActual()
    {
        show(actual)
        position = actual.number - 1
    }

    private fun showNext()
    {
        // safety
        if (position == match.jams.count() - 1) return

        val next = match.jams[position + 1]
        show(next)
        position++
    }
}
