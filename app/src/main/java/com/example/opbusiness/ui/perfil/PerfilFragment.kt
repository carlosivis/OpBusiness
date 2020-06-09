package com.example.opbusiness.ui.perfil

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.opbusiness.R
import com.example.opbusiness.data.model.PerfilModel
import kotlinx.android.synthetic.main.fragment_perfil.*

class PerfilFragment : Fragment() {

    lateinit var perfilAdapter: PerfilAdapter
    var list: List<PerfilModel> = listOf(PerfilModel("Perfil Comerciante",1),PerfilModel("Perfil Mensalidade",3), PerfilModel("Perfil Serviços",2))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_perfil, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        configureRecyclerView(list)
        btnAddPerfil.setOnClickListener { findNavController().navigate(R.id.action_perfilFragment_to_homeFragment) }
    }

    private fun configureRecyclerView(list:List<PerfilModel>) {
        perfilAdapter = PerfilAdapter(list)
        recyclerPerfil.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = perfilAdapter
        }
    }
}