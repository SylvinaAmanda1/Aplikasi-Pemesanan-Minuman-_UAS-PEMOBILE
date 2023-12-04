package com.example.geraicafe

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.geraicafe.databinding.ActivitySigninBinding
import com.example.geraicafe.databinding.PembayaranBinding

class Pembayaran: AppCompatActivity() {

        private lateinit var binding: PembayaranBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        binding = PembayaranBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLanjutPembayaran.setOnClickListener(View.OnClickListener {

                val intent = Intent(this, BerhasilActivity::class.java)
                startActivity(intent)

        })

    }
}

