package pa.chan.data.features.hotel.room_data

import pa.chan.data.features.hotel.room_data.dto.RoomDto
import javax.inject.Inject

class RoomRemoteDataSource @Inject constructor(
    private val roomApi: RoomApi
){

    suspend fun getRoomsForBooking() : List<RoomDto> {
        return roomApi.getRoomsForBooking().rooms
    }

}