data class Logs {
    @PRIMARY
    val action: String
    @PRIMARY
    val date: Long

    @FOREIGN(REFERENCES = User.id)
    val moderator_id: Long,
    @FOREIGN(REFERENCES = User.id)
    val target_id: Long,
    val reason: String? = null,
}