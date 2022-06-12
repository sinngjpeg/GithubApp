package com.sinngjpeg.githubapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import com.google.firebase.analytics.FirebaseAnalytics
import com.sinngjpeg.githubapp.databinding.ActivityMainBinding
import com.sinngjpeg.githubapp.databinding.ItemRepositoryBinding

class MainActivity : AppCompatActivity() {

    object Constants {
        const val THREAD_SLEEP_SPLASH_SCREEN = 1000L
    }

    private lateinit var analytics: FirebaseAnalytics
    private lateinit var binding: ItemRepositoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ItemRepositoryBinding.inflate(layoutInflater)
        Thread.sleep(Constants.THREAD_SLEEP_SPLASH_SCREEN)
        setTheme(R.style.Theme_GithubApp)
        setContentView(binding.root)
        analytics = FirebaseAnalytics.getInstance(this)
    }
}
