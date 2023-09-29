data class Guild {
    @PRIMARY
    val id: Long,

    val settings: ArrayListOf<Setting>,
    val reviews: ArrayListOf<Review>
}