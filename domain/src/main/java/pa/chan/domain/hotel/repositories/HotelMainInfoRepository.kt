package pa.chan.domain.hotel.repositories

import pa.chan.domain.hotel.model.HotelMainInfoModel

interface HotelMainInfoRepository {
    suspend fun getHotelInfo() : HotelMainInfoModel

}