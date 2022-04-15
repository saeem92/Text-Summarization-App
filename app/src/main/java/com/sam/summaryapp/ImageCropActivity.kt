package com.sam.summaryapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ImageCropActivity : AppCompatActivity() {

    companion object {
        private const val FILE_DIR = "FileDir"
        fun newIntent(context: Context, selectedFilePath: String) =
            Intent(context, ImageCropActivity::class.java).putExtra(FILE_DIR, selectedFilePath)
    }
}
