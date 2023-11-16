package pa.chan.data.features.hotel.reservation_data

import pa.chan.data.features.hotel.reservation_data.dto.ReservationDto
import javax.inject.Inject

class ReservationRemoteDataSource @Inject constructor(
    private val reservationApi: ReservationApi
) {
    suspend fun getReservationInfo(): ReservationDto {
        return reservationApi.getReservationInfo()
    }
}