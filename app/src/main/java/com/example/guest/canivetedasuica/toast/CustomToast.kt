package com.example.guest.canivetedasuica.toast

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.example.guest.canivetedasuica.R

class CustomToast(val context: Context, val inflater: LayoutInflater, val type: Int) {

    val CUSTOM = 0
    val INFO = 1
    val ERROR = 2
    val WARNING = 3
    val SUCESS = 4



    fun showToast(text: String) {
        var customToastroot: View? = null

        when (type){
            0 -> customToastroot = inflater.inflate(R.layout.custom_toast, null)
            1 -> customToastroot = inflater.inflate(R.layout.info_toast, null)
            2 -> customToastroot = inflater.inflate(R.layout.error_toast, null)
            3 -> customToastroot = inflater.inflate(R.layout.warning_toast, null)
            4 -> customToastroot = inflater.inflate(R.layout.success_toast, null)
        }


        //val customToastroot = inflater.inflate(R.layout.custom_toast, null)
        val customtoast = Toast(context)

        val textView = customToastroot?.findViewById<TextView>(R.id.textView1)
        textView?.text = text

        customtoast.view = customToastroot
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.BOTTOM, 0, 0)
        customtoast.duration = Toast.LENGTH_LONG

        customtoast.show()
    }

}

//info, error, sucesso, warning