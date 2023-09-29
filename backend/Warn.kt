data class Warn {
    @PRIMARY
    val date: Long,

    val moderator_id: Long,
    val target_id: Long,
    val reason: String? = null
}