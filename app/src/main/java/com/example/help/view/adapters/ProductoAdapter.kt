package com.example.help.view.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.help.R
import com.example.help.models.Producto

class ProductoAdapter(private val productoLista: ArrayList<Producto>) : RecyclerView.Adapter<ProductoAdapter.ProductoViewHolder>() {
    class ProductoViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val tipo = view.findViewById<TextView>(R.id.tvTipoProducto)
        val cantidad = view.findViewById<TextView>(R.id.tvCantidadProducto)
        val proveedor = view.findViewById<TextView>(R.id.tvProveedor)
        val ubicacion = view.findViewById<TextView>(R.id.tvUbicacion)
        val estado = view.findViewById<TextView>(R.id.tvEstado)

        fun bind(producto: Producto){
            tipo.text = producto.tipo
            cantidad.text = producto.cantidad.toString()
            proveedor.text = producto.proveedor
            ubicacion.text = producto.ubicacion
            estado.text = producto.estado
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ProductoViewHolder(layoutInflater.inflate(R.layout.item_producto, parent,false))
    }

    override fun getItemCount(): Int {
        return productoLista.size
    }

    override fun onBindViewHolder(holder: ProductoViewHolder, position: Int) {
        val item = productoLista[position]
        holder.bind(item)
    }
}