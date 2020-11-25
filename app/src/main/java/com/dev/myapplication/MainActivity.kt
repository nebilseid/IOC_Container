package com.dev.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.dev.ioc.Container

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fakeRepo = Container.getContainer().get(
            FakeRepo::class.java
        )

        Toast.makeText(
            this,
            fakeRepo.data,
            Toast.LENGTH_LONG
        ).show()

    }
}