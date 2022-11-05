package com.example.repository

import android.content.Context
import android.widget.Toast

object Utils {

    fun showToast(context: Context, toastMsg: String) {

        Toast.makeText(context, toastMsg, Toast.LENGTH_SHORT).show()
    }
}