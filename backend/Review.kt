data class Review {
    @PRIMARY
    val user_id: Long,

    val mark: Byte,
    val comment: String,
    val likes: Int,
    val dislikes: Int
}