package io.aerain.thatismyairpods

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.aerain.thatismyairpods.service.OverlayService

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent(this, OverlayService::class.java)
        startService(intent)
        finish()
    }
}