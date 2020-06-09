package com.example.opbusiness.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.opbusiness.R
import kotlinx.android.synthetic.main.fragment_despesas.*
import kotlinx.android.synthetic.main.fragment_estoque.*
import kotlinx.android.synthetic.main.fragment_estoque.btnPeríodo

class DespesasFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_despesas, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        btnEdit.setOnClickListener{
            findNavController().navigate(R.id.action_despesasFragment_to_inputFragment)
        }
        btnAnalyze.setOnClickListener{
            findNavController().navigate(R.id.action_despesasFragment_to_inputFragment)
        }
        btnPeríodo.setOnClickListener{
            //TODO
        }
    }
}