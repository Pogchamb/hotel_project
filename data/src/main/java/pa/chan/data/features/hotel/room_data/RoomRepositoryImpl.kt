package pa.chan.data.features.hotel.room_data

import pa.chan.data.features.hotel.room_data.dto.toModel
import pa.chan.domain.features.hotel.model.RoomModel
import pa.chan.domain.features.hotel.repositories.RoomRepository
import javax.inject.Inject

class RoomRepositoryImpl @Inject constructor(
    private val roomRemoteDataSource: RoomRemoteDataSource
) : RoomRepository {

    override suspend fun getRoomsForBooking(): List<RoomModel> {
        try {
            return roomRemoteDataSource.getRoomsForBooking().map {
                it.toModel()
            }
        } catch (e: Exception) {
            throw e
        }
    }

}