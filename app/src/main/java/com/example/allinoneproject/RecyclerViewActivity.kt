package com.example.allinoneproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var productArrayList: ArrayList<Product>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        // recycler view code here

        // variable intricate
        recyclerView = findViewById(R.id.recyclerView)

        // to set behave of item inside recycler view
        recyclerView.layoutManager = LinearLayoutManager(this)

        // initialized product arraylist
        productArrayList = arrayListOf<Product>()


    }
}