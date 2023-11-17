package pa.chan.domain.hotel.use_cases

import pa.chan.domain.hotel.model.RoomModel
import pa.chan.domain.hotel.repositories.RoomRepository
import javax.inject.Inject

class GetRoomsForBookingUseCase @Inject constructor(
    private val roomRepository: RoomRepository
) {

    suspend operator fun invoke() : List<RoomModel> {
        return roomRepository.getRoomsForBooking()
    }

}