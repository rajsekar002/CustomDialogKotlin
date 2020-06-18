package com.androindian.customdialog

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        customdialog.setOnClickListener {
            var dialog=Dialog(this@MainActivity)
            dialog.setContentView(R.layout.custom)
            dialog.setCancelable(false)
            dialog.button.setOnClickListener {
                dialog.dismiss()
            }
            dialog.show()
        }
    }
}
