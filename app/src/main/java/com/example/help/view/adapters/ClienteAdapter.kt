package com.example.help.view.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.help.R
import com.example.help.models.Cliente


class ClienteAdapter(private val clienteLista: ArrayList<Cliente>) : RecyclerView.Adapter<ClienteAdapter.ClienteViewHolder>() {

    class ClienteViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val nombre = view.findViewById<TextView>(R.id.tvNombreCliente)
        val localizacion = view.findViewById<TextView>(R.id.tvLocalCliente)
        val estado = view.findViewById<TextView>(R.id.tvEstadoCliente)

        fun bind(cliente: Cliente){
            nombre.text = cliente.nombre
            localizacion.text = cliente.localizacion
            estado.text = cliente.estado
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClienteViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ClienteViewHolder(layoutInflater.inflate(R.layout.item_cliente , parent, false))
    }

    override fun onBindViewHolder(holder: ClienteViewHolder, position: Int) {
        val item = clienteLista[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return clienteLista.size
    }
}