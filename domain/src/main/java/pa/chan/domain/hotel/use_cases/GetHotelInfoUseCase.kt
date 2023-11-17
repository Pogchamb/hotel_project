package pa.chan.domain.hotel.use_cases

import pa.chan.domain.hotel.model.HotelMainInfoModel
import pa.chan.domain.hotel.repositories.HotelMainInfoRepository
import javax.inject.Inject

class GetHotelInfoUseCase @Inject constructor(
    private val hotelMainInfoRepository: HotelMainInfoRepository
) {

    suspend operator fun invoke(): HotelMainInfoModel {
        return hotelMainInfoRepository.getHotelInfo()
    }

}