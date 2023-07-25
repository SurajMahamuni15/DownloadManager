package com.example.downloadfile

import android.app.DownloadManager
import android.content.ClipDescription
import android.content.Context
import android.net.Uri

class FileDownloader(private val context: Context) : Downloader {
    override fun downloadFile(url: String, fileName: String, description: String): Long {
        val downloadManager = context.getSystemService(DownloadManager::class.java)
        val request = DownloadManager.Request(Uri.parse(url))
            .setTitle(fileName)
            .setDescription(description)
            .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
            .setAllowedOverMetered(true)
        return downloadManager.enqueue(request)
    }
}