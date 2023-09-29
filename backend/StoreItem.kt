data class StoreItem {
    @PRIMARY
    val id: Long,

    @FOREIGN(REFERENCES = Guild.id)
    val guild_id: Long,
    val type: Byte,
    val name: String,
    val description: String,
    val price: Int
}