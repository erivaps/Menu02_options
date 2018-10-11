package com.kotlin.menu2.menu2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ordenar(view : View) {


        var id: Int = rbOrderGroup.checkedRadioButtonId
        if (id != -1) {
            val radio: RadioButton = findViewById(id)
            println(radio.text.toString())
            txtOrdered.setText(radio.text.toString())

        } else {
            txtOrdered.setText(R.string.txtNoSelect)
        }
    }
}
