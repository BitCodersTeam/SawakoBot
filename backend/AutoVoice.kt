data class AutoVoice {
    @PRIMARY
    @FOREIGN(REFERENCES = User.id)
    val owner: Long,
    val guild_id: Long,
    val voice_id: Long
}


  