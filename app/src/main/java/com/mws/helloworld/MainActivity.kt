package com.mws.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ini variabel orang
        var namaLengkap : String = "budi"
        var usia = 17

        // ini variabel khusus ....
        var status : Boolean = true
    }
}