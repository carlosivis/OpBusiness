package com.example.opbusiness.ui.perfil

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.opbusiness.R
import com.example.opbusiness.data.model.PerfilModel
import kotlinx.android.synthetic.main.recycler_perfil.view.*

class PerfilAdapter(private var list: List<PerfilModel>): RecyclerView.Adapter<PerfilAdapter.PerfilViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PerfilAdapter.PerfilViewHolder=
        PerfilViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.recycler_perfil, parent, false)
        )

    override fun getItemCount()= list.size

    override fun onBindViewHolder(holder: PerfilAdapter.PerfilViewHolder, position: Int) {
        val perfil = list[position]
        holder.bind(perfil)
    }
    class PerfilViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(perfil: PerfilModel){
            itemView.txtNamePerfil.text = perfil.nome
            itemView.txtNamePerfil.setOnClickListener {
                Navigation.findNavController(itemView).navigate(R.id.action_perfilFragment_to_homeFragment)
            }
        }
    }
}