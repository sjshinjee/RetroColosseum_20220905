package com.example.retrocolosseum_20220905.utils

import android.content.Context

class ContextUtil {

    companion object {
        private val prefName = "colosseum_Retrofit_pref"
        private val AUTO_LOGIN = "AUTO_LOGIN"
        private val LOGIN_TOKEN = "LOGIN_TOKEN"

        fun setLoginToken(context: Context, token: String){
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            pref.edit().putString("LOGIN_TOKEN", token).apply()
        }

        fun setLoginToken(context: Context) : String {
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            return pref.getString("LOGIN_TOKEN", "")!!
        }

        fun setAutoLogin(context: Context, isAutoLogin : Boolean){
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            pref.edit().putBoolean("AUTO_LOGIN", isAutoLogin).apply()
        }

        fun getAutoLogin(context: Context) : Boolean {
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            return pref.getBoolean("AUTO_LOGIN", false)
        }

        fun clearData(context: Context){
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            pref.edit().clear().apply()
        }
    }


}