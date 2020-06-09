package com.example.opbusiness.ui.fornecedores

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.opbusiness.R
import com.example.opbusiness.data.model.FornecedorModel
import com.example.opbusiness.data.model.PerfilModel
import com.example.opbusiness.ui.perfil.PerfilAdapter
import kotlinx.android.synthetic.main.fragment_fornecedores.*
import kotlinx.android.synthetic.main.fragment_perfil.*


class FornecedoresFragment : Fragment() {

    lateinit var fornecedoresAdapter: FornecedoresAdapter
    var list = ArrayList<FornecedorModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fornecedores, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        configureRecyclerView()
        btnAddFornecedor.setOnClickListener {
            fragmentManager?.let { fragmentManager ->
                AddFornecedor{fornecedor ->
                    list.add(fornecedor)

                    fornecedoresAdapter.notifyDataSetChanged()
                }.show(fragmentManager,"Add Fornecedor")
            }
        }
    }
    private fun configureRecyclerView() {
        fornecedoresAdapter = FornecedoresAdapter(list)
        recyclerFornecedor.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = fornecedoresAdapter
        }
    }
}