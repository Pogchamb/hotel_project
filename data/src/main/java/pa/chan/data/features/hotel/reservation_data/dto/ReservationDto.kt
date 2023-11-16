package pa.chan.data.features.hotel.reservation_data.dto

import com.google.gson.annotations.SerializedName
import pa.chan.domain.features.hotel.model.ReservationModel

data class ReservationDto(
    val id: Int,
    @SerializedName("hotel_name")
    val hotelName: String,
    @SerializedName("hotel_adress")
    val hotelAdress: String,
    val horating: Int,
    @SerializedName("rating_name")
    val ratingName: String,
    val departure: String,
    @SerializedName("arrival_country")
    val arrivalCountry: String,
    @SerializedName("tour_date_start")
    val tourDateStart: String,
    @SerializedName("tour_date_stop")
    val tourDateStop: String,
    @SerializedName("number_of_nights")
    val numberOfNights: Int,
    val room: String,
    val nutrition: String,
    @SerializedName("tour_price")
    val tourPrice: Int,
    @SerializedName("fuel_charge")
    val fuelCharge: Int,
    @SerializedName("service_charge")
    val serviceCharge: Int
)

fun ReservationDto.toModel(): ReservationModel = ReservationModel(
    id,
    hotelName,
    hotelAdress,
    horating,
    ratingName,
    departure,
    arrivalCountry,
    tourDateStart,
    tourDateStop,
    numberOfNights,
    room,
    nutrition,
    tourPrice,
    fuelCharge,
    serviceCharge
)



