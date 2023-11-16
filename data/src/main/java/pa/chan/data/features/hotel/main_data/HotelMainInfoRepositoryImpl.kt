package pa.chan.data.features.hotel.main_data

import pa.chan.data.features.hotel.main_data.dto.toModel
import pa.chan.domain.features.hotel.model.HotelMainInfoModel
import pa.chan.domain.features.hotel.repositories.HotelMainInfoRepository
import javax.inject.Inject

class HotelMainInfoRepositoryImpl @Inject constructor(
    private val hotelMainInfoRemoteDataSource: HotelMainInfoRemoteDataSource
) : HotelMainInfoRepository {
    override suspend fun getHotelInfo(): HotelMainInfoModel {
        try {
            return hotelMainInfoRemoteDataSource.getHotelInfo().toModel()
        } catch (e: Exception) {
            throw e
        }
    }
}