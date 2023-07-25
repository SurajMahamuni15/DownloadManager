package com.example.downloadfile

import android.content.ClipDescription
import android.content.Context

interface Downloader {
    fun downloadFile(url : String,fileName: String,description: String) : Long
}