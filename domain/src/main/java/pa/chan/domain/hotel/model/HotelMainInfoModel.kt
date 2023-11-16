package pa.chan.domain.hotel.model

data class HotelMainInfoModel(
    val id: Int,
    val name: String,
    val adress: String,
    val minimalPrice: Int,
    val priceForIt: String,
    val rating: Int,
    val ratingName: String,
    val imageUrls: List<String>,
    val aboutTheHotel : AboutHotelModel
)



data class AboutHotelModel(
    val description: String,
    val peculiarities: List<String>
)