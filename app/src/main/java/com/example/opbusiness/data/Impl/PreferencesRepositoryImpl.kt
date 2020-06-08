package com.example.opbusiness.data.Impl

import android.content.Context
import android.content.SharedPreferences
import com.example.opbusiness.data.Repository.PreferencesRepository

class PreferencesRepositoryImpl(context: Context): PreferencesRepository{
    private val preferences: SharedPreferences = context.getSharedPreferences("Preferences", Context.MODE_PRIVATE)
    private val editor = preferences.edit()
}