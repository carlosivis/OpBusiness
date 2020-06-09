package com.example.opbusiness.ui.fornecedores

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.opbusiness.R
import com.example.opbusiness.data.model.FornecedorModel
import kotlinx.android.synthetic.main.recycler_fornecedor.view.*

class FornecedoresAdapter(private val list: List<FornecedorModel>)
    : RecyclerView.Adapter<FornecedoresAdapter.FornecedorViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FornecedoresAdapter.FornecedorViewHolder =
        FornecedorViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.recycler_fornecedor, parent, false)
            )

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: FornecedoresAdapter.FornecedorViewHolder, position: Int) {
        val fornecedor = list[position]
        holder.bind(fornecedor)
    }

    class FornecedorViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(fornecedor: FornecedorModel){
            itemView.txtNomeFornecedor.text = fornecedor.nome
            itemView.txtEmailFornecedor.text = fornecedor.email
            itemView.txtTelefoneFornecedor.text = fornecedor.telefone
        }
    }
}