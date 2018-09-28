package com.example.grigviktor.myrecycle

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        val adapter = TitleAdapter(this, Supplier.titles)
        recyclerView.adapter = adapter

        imageButton.setOnClickListener{
            val intent = Intent(this, GetRequestStepOne::class.java)
            startActivity(intent)
        }

    }

}
