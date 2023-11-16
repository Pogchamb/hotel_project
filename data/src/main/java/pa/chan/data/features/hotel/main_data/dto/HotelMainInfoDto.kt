package pa.chan.data.features.hotel.main_data.dto

import com.google.gson.annotations.SerializedName
import pa.chan.domain.features.hotel.model.AboutHotelModel
import pa.chan.domain.features.hotel.model.HotelMainInfoModel

data class HotelMainInfoDto(
    val id: Int,
    val name: String,
    val adress: String,
    @SerializedName("minimal_price")
    val minimalPrice: Int,
    @SerializedName("price_for_it")
    val priceForIt: String,
    val rating: Int,
    @SerializedName("rating_name")
    val ratingName: String,
    @SerializedName("image_urls")
    val imageUrls: List<String>,
    @SerializedName("about_the_hotel")
    val aboutTheHotel : AboutHotelDto
)

data class AboutHotelDto(
    val description: String,
    val peculiarities: List<String>
)

fun AboutHotelDto.toModel() : AboutHotelModel = AboutHotelModel(
    description, peculiarities
)


fun HotelMainInfoDto.toModel() : HotelMainInfoModel = HotelMainInfoModel(
    id,
    name,
    adress,
    minimalPrice,
    priceForIt,
    rating,
    ratingName,
    imageUrls,
    aboutTheHotel.toModel()
)