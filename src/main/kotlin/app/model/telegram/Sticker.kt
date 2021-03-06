package app.model.telegram

data class Sticker(
    val file_id: String,
    val width: Int,
    val height: Int,
    val thumb: PhotoSize?,
    val emoji: String?,
    val set_name: String?,
    val mask_position: MaskPosition?,
    val file_size: Int?
)
