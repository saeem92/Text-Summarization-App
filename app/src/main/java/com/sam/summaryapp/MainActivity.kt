package com.sam.summaryapp

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var scanforimage: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        scanforimage = findViewById(R.id.ScanforImage)

        scanforimage.setOnClickListener {

            val intent = Intent("android.media.action.IMAGE_CAPTURE")
            startActivity(intent)
        }
    }
}

private fun Button.setOnClickListener(onClickListener: DialogInterface.OnClickListener) {
    TODO("Not yet implemented")
}

