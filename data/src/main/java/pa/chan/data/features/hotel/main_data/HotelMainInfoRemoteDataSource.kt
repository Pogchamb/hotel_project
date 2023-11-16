package pa.chan.data.features.hotel.main_data

import pa.chan.data.features.hotel.main_data.dto.HotelMainInfoDto
import javax.inject.Inject

class HotelMainInfoRemoteDataSource @Inject constructor(
    private val hotelMainInfoApi: HotelMainInfoApi
) {
    suspend fun getHotelInfo() : HotelMainInfoDto {
        return hotelMainInfoApi.getHotelInfo()
    }
}