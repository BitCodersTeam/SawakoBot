data class Guild {
    @PRIMARY
    val id: Long,

    val settings: ArrayListOf<Setting>,
    val store: ArrayListOf<StoreItem>,
    val autoVoices: ArrayListOf<AutoVoice>
    val reviews: ArrayListOf<Review>
}