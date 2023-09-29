data class Setting {
    @PRIMARY
    val name: String,
    val status: Boolean,

    val channel_id: Long
}