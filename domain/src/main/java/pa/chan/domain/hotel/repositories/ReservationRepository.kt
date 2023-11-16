package pa.chan.domain.hotel.repositories

import pa.chan.domain.hotel.model.ReservationModel

interface ReservationRepository {

    suspend fun getReservedInfo(): ReservationModel
}