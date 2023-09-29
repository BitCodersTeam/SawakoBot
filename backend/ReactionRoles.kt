data class ReactionRoles {
    @PRIMARY
    val message_id: Long,
    @PRIMARY
    val reaction: String,

    @FOREIGN(REFERENCES = Guild.id)
    val guild_id: Long,
    val role_id: Long
}