package pa.chan.data.features.hotel.room_data

import pa.chan.data.features.hotel.room_data.dto.RoomsDto
import retrofit2.http.GET

interface RoomApi {

    @GET("8b532701-709e-4194-a41c-1a903af00195")
    suspend fun getRoomsForBooking(): RoomsDto
}