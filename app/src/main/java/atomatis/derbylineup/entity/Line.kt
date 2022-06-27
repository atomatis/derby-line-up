package atomatis.derbylineup.entity

data class Line (
    val blockers: Array<Player>,
    val pivots: Array<Player>,
    val secondaryPivots: Array<Player>,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Line

        if (!blockers.contentEquals(other.blockers)) return false
        if (!pivots.contentEquals(other.pivots)) return false
        if (!secondaryPivots.contentEquals(other.secondaryPivots)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = blockers.contentHashCode()
        result = 31 * result + pivots.contentHashCode()
        result = 31 * result + secondaryPivots.contentHashCode()
        return result
    }
}
