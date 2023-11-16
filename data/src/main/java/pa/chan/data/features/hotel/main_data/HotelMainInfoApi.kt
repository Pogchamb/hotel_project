package pa.chan.data.features.hotel.main_data

import pa.chan.data.features.hotel.main_data.dto.HotelMainInfoDto
import retrofit2.http.GET

interface HotelMainInfoApi {
    @GET("d144777c-a67f-4e35-867a-cacc3b827473")
    suspend fun getHotelInfo(): HotelMainInfoDto
}