package cl.sulcansystem.retrofit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    var name : TextView
    var phone : TextView
    var mail : TextView

    init {
        name = itemView.findViewById(R.id.txtname)
        phone = itemView.findViewById(R.id.txtphone)
        mail = itemView.findViewById(R.id.txtmail)
    }
}

class UserAdapter(var listaUsuarios:MutableList<User>): RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.phone.text =listaUsuarios[position].phone
        holder.mail.text = listaUsuarios[position].email
        holder.name.text = listaUsuarios[position].name
    }

    override fun getItemCount(): Int {
    return listaUsuarios.size    }
}


