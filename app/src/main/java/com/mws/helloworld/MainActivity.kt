package com.mws.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var txtPanjang : EditText
    private lateinit var txtLebar : EditText
    private lateinit var txtTinggi : EditText
    private lateinit var btnHitung : Button
    private lateinit var txtResult : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtPanjang = findViewById(R.id.txtPanjang)
        txtLebar = findViewById(R.id.txtLebar)
        txtTinggi = findViewById(R.id.txtTinggi)
        btnHitung = findViewById(R.id.btnHitung)
        txtResult = findViewById(R.id.txtResult)

        btnHitung.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        if(p0.id == R.id.btnHitung) {
            val inputPanjang = txtPanjang.text.toString().trim()
            val inputLebar = txtLebar.text.toString().trim()
            val inputTinggi = txtTinggi.text.toString().trim()

            val volume = inputPanjang.toDouble() * inputLebar.toDouble() * inputTinggi.toDouble()

            txtResult.text = volume.toString()
        }
    }
}

