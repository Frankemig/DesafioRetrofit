package cl.sulcansystem.retrofit

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

private const val BASE_URL = "https://jsonplaceholder.typicode.com"

interface Api{

    @GET("/users")
    fun getUsers():Call<List<User>>

    @GET("/users/{id]")
    fun getUser(@Path("id")userId:Int): Call<User>

}
class RetrofitClient{
    companion object{
        fun retrofitInstance():Api{
            val retrofit = Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(Api::class.java)
        }
    }
}