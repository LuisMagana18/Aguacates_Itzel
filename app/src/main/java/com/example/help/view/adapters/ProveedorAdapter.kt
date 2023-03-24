package com.example.help.view.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.help.R
import com.example.help.models.Proveedor

class ProveedorAdapter(private val proveedorLista: ArrayList<Proveedor>) : RecyclerView.Adapter<ProveedorAdapter.ProveedorViewHolder>() {

    class ProveedorViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val nombre = view.findViewById<TextView>(R.id.tvNombreProveedor)
        val origen = view.findViewById<TextView>(R.id.tvOrigenProveedor)
        val viajes = view.findViewById<TextView>(R.id.tvViajesProveedor)

        fun bind(proveedor: Proveedor){
            nombre.text = proveedor.nombre
            origen.text = proveedor.origen
            viajes.text = proveedor.viajes.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProveedorViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ProveedorViewHolder(layoutInflater.inflate(R.layout.item_proveedor , parent, false))
    }

    override fun onBindViewHolder(holder: ProveedorViewHolder, position: Int) {
        val item = proveedorLista[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return proveedorLista.size
    }
}
