package com.example.opbusiness.data.Repository

import com.example.opbusiness.data.model.FornecedorModel

interface PreferencesRepository {
    fun saveFornecedor(fornecedor: FornecedorModel)
}