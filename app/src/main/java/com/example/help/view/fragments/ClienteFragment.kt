package com.example.help.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.help.R
import com.example.help.models.Cliente
import com.example.help.view.adapters.ClienteAdapter
import com.example.help.view.providers.PersonaProvider

class ClienteFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vista = inflater.inflate(R.layout.fragment_cliente, container, false)
        val recyclerView = vista.findViewById<RecyclerView>(R.id.recycler)

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        recyclerView.itemAnimator = DefaultItemAnimator()

        recyclerView.adapter = ClienteAdapter(PersonaProvider.clienteLista)

        return vista
    }

}