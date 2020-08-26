package cl.sulcansystem.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadApiData()
    }
    private fun loadApiData(){
    val service = RetrofitClient.retrofitInstance()
    val call = service.getUsers()

        call.enqueue(object : retrofit2.Callback<List<User>> {
            override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
                response.body()?.map {

                    Log.d("MAIN", "${it.id} - ${it.name} - ${it.username}")

                }
            }
            override fun onFailure(call: Call<List<User>>, t: Throwable) {
                Log.d("MAIN", "Error: " + t)
                Toast.makeText(
                    applicationContext,
                    "Error: no pudimos recuperar los users desde el api",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })

    }
}
