package pa.chan.data.features.hotel.room_data.dto

import com.google.gson.annotations.SerializedName
import pa.chan.domain.features.hotel.model.RoomModel

data class RoomsDto(
    val rooms: List<RoomDto>
)


data class RoomDto(
    val id: Int,
    val name: String,
    val price: Int,
    val pricePer: String,
    val peculiarities: List<String>,
    @SerializedName("image_urls")
    val imageUrls: List<String>
)

fun RoomDto.toModel() : RoomModel = RoomModel(
    id, name, price, pricePer, peculiarities, imageUrls
)
