package pa.chan.domain.hotel.use_cases

import pa.chan.domain.hotel.model.ReservationModel
import pa.chan.domain.hotel.repositories.ReservationRepository
import javax.inject.Inject

class GetReservedInfoUseCase @Inject constructor(
    private val reservationRepository: ReservationRepository
) {

    suspend operator fun invoke() : ReservationModel {
        return reservationRepository.getReservedInfo()
    }

}