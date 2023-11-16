package pa.chan.domain.features.hotel.repositories

import pa.chan.domain.features.hotel.model.HotelMainInfoModel

interface HotelMainInfoRepository {
    suspend fun getHotelInfo() : HotelMainInfoModel

}