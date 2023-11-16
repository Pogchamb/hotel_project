package pa.chan.domain.features.hotel.repositories

import pa.chan.domain.features.hotel.model.RoomModel

interface RoomRepository {
    suspend fun getRoomsForBooking(): List<RoomModel>
}