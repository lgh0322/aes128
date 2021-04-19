package com.vaca.aes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val secretKey: String = "662ede816988e58fb6d057d9d85605e0"
        val c=AESCrypt.encrypt("李光浩",secretKey)
        val d=AESCrypt.decryptWithAES(secretKey,c)
        Log.e("fuck",c!!)
        Log.e("fuck22",d!!)
    }
}