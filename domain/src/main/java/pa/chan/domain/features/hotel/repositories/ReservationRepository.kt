package pa.chan.domain.features.hotel.repositories

import pa.chan.domain.features.hotel.model.ReservationModel

interface ReservationRepository {

    suspend fun getReservedInfo(): ReservationModel
}