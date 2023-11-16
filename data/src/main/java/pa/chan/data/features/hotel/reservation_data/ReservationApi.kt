package pa.chan.data.features.hotel.reservation_data

import pa.chan.data.features.hotel.reservation_data.dto.ReservationDto
import retrofit2.http.GET

interface ReservationApi {

    @GET("63866c74-d593-432c-af8e-f279d1a8d2ff")
    suspend fun getReservationInfo() : ReservationDto

}