package com.example.downloadfile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.downloadfile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    private lateinit var fileDownloader : FileDownloader
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fileDownloader = FileDownloader(this)
        binding.download.setOnClickListener {
            val url = binding.urlEditText.text.toString()
            fileDownloader.downloadFile(url,"image","description")
        }
    }
}