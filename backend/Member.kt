data class Member {
    @PRIMARY
    @FOREIGN(REFERENCES = Guild.id)
    val guild_id: Long,

    @PRIMARY
    @FOREIGN(REFERENCES = User.id)
    val user_id: Long

    val name: String? = null,
    val gender: String? = null,
    val birthdate: String? = null,
    val about: String? = null,

    val pair_id: String? = null,
    val pair_date: Long? = null,

    val warns: ArrayListOf<Warn>,

    val exp: Int = 0,
    val up_exp: Int = 50,
    val lvl: Int = 0,
    val wallet: Long = 0,
    val message_count: Long = 0
}
