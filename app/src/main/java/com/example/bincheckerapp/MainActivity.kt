package com.example.bincheckerapp

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.bincheckerapp.network.BinApi
import com.example.bincheckerapp.network.RetrofitHelper
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private val retrofitCLient = RetrofitHelper.getInstance().create(BinApi::class.java)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        lifecycleScope.launch {

            val result = retrofitCLient.getDateOfBin(54241801)
            Log.d("qqqwww", "---> ${result.body()}")

        }


    }
}