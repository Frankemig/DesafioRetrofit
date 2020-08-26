package cl.sulcansystem.retrofit

import android.location.Address

/*"id": 1,
"name": "Leanne Graham",
"username": "Bret",
"email": "Sincere@april.biz",
"address":{
      "street": "Kulas Light",
      "suite": "Apt. 556",
      "city": "Gwenborough",
      "zipcode": "92998-3874",
      "geo": {
        "lat": "-37.3159",
        "lng": "81.1496"   */
data class User (val id: Int, val name: String, val username: String, val email:String, val phone : String)
