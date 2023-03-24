package com.example.help.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.help.R
import com.example.help.view.adapters.ProductoAdapter
import com.example.help.view.providers.ProductoProvider

class PisoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vista = inflater.inflate(R.layout.fragment_piso, container, false)
        val recyclerView = vista.findViewById<RecyclerView>(R.id.recyclerPiso)

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        recyclerView.itemAnimator = DefaultItemAnimator()

        recyclerView.adapter = ProductoAdapter(ProductoProvider.pisoLista)

        return vista
    }

}