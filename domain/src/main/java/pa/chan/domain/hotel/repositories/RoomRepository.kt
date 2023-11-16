package pa.chan.domain.hotel.repositories

import pa.chan.domain.hotel.model.RoomModel

interface RoomRepository {
    suspend fun getRoomsForBooking(): List<RoomModel>
}