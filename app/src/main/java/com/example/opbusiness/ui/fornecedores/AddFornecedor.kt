package com.example.opbusiness.ui.fornecedores

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.opbusiness.R
import com.example.opbusiness.data.model.FornecedorModel
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.fragment_add_fornecedor.*

class AddFornecedor(val addCallBack: (FornecedorModel) -> Unit ) : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_fornecedor, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnAddConfirmFornecedor.setOnClickListener {

            val nome = inputFornecedorNome.text.toString()
            val email = inputFornecedorEmail.text.toString()
            val tel = inputFornecedorTel.text.toString()

            addCallBack(FornecedorModel(nome,email,tel))
            dismiss()
        }
    }
}