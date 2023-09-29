data class Warn {
    @PRIMARY
    val date: Long,

    @FOREIGN(REFERENCES = User.id)
    val moderator_id: Long,

    @FOREIGN(REFERENCES = User.id)
    val target_id: Long,
    
    val reason: String? = null
}