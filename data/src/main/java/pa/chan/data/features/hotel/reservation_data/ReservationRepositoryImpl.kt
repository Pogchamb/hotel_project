package pa.chan.data.features.hotel.reservation_data

import pa.chan.data.features.hotel.reservation_data.dto.toModel
import pa.chan.domain.features.hotel.model.ReservationModel
import pa.chan.domain.features.hotel.repositories.ReservationRepository
import javax.inject.Inject

class ReservationRepositoryImpl @Inject constructor(
    private val reservationRemoteDataSource: ReservationRemoteDataSource
) : ReservationRepository {
    override suspend fun getReservedInfo(): ReservationModel {
        try {
            return reservationRemoteDataSource.getReservationInfo().toModel()
        } catch (e : Exception) {
            throw e
        }
    }

}