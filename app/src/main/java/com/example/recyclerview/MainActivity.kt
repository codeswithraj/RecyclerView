package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sample.DataModel

class MainActivity : AppCompatActivity(),RecyclerViewAdapter.setOnClick {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data= arrayListOf<DataModel>(
            DataModel("AIMIT","Kankarbagh,Patna","https://w.forfun.com/fetch/05/05eeb93a2e41734ecb6044146351f11e.jpeg")
            ,DataModel("AIMIT","Kankarbagh,Patna","https://images.pexels.com/photos/60597/dahlia-red-blossom-bloom-60597.jpeg?cs=srgb&dl=pexels-pixabay-60597.jpg&fm=jpg")
            ,DataModel("AIMIT","Kankarbagh,Patna","https://images.pexels.com/photos/60597/dahlia-red-blossom-bloom-60597.jpeg?cs=srgb&dl=pexels-pixabay-60597.jpg&fm=jpg")
            ,DataModel("AIMIT","Kankarbagh,Patna","https://images.pexels.com/photos/60597/dahlia-red-blossom-bloom-60597.jpeg?cs=srgb&dl=pexels-pixabay-60597.jpg&fm=jpg")
            ,DataModel("AIMIT","Kankarbagh,Patna","https://images.pexels.com/photos/60597/dahlia-red-blossom-bloom-60597.jpeg?cs=srgb&dl=pexels-pixabay-60597.jpg&fm=jpg")
            ,DataModel("AIMIT","Kankarbagh,Patna","https://images.pexels.com/photos/60597/dahlia-red-blossom-bloom-60597.jpeg?cs=srgb&dl=pexels-pixabay-60597.jpg&fm=jpg")
            ,DataModel("AIMIT","Kankarbagh,Patna","https://images.pexels.com/photos/60597/dahlia-red-blossom-bloom-60597.jpeg?cs=srgb&dl=pexels-pixabay-60597.jpg&fm=jpg")
            ,DataModel("AIMIT","Kankarbagh,Patna","https://images.pexels.com/photos/60597/dahlia-red-blossom-bloom-60597.jpeg?cs=srgb&dl=pexels-pixabay-60597.jpg&fm=jpg")
            ,DataModel("AIMIT","Kankarbagh,Patna","https://images.pexels.com/photos/60597/dahlia-red-blossom-bloom-60597.jpeg?cs=srgb&dl=pexels-pixabay-60597.jpg&fm=jpg")
            ,DataModel("AIMIT","Kankarbagh,Patna","https://images.pexels.com/photos/60597/dahlia-red-blossom-bloom-60597.jpeg?cs=srgb&dl=pexels-pixabay-60597.jpg&fm=jpg")
            ,DataModel("AIMIT","Kankarbagh,Patna","https://images.pexels.com/photos/60597/dahlia-red-blossom-bloom-60597.jpeg?cs=srgb&dl=pexels-pixabay-60597.jpg&fm=jpg")
            ,DataModel("AIMIT","Kankarbagh,Patna","https://images.pexels.com/photos/60597/dahlia-red-blossom-bloom-60597.jpeg?cs=srgb&dl=pexels-pixabay-60597.jpg&fm=jpg")

        )
        val recyclerView=findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.layoutManager=GridLayoutManager(this,1)
        val recyclerAdapter=RecyclerViewAdapter(this,data,this)
        recyclerView.adapter=recyclerAdapter
    }
    override fun onClick(position:Int){
        when(position){
            position->startActivity(Intent(this,MainActivity2::class.java))
        }
    }
}