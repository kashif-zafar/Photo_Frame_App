package com.example.photoframe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    var currentimage = 0

    lateinit var image: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        val prev=findViewById<ImageButton>(R.id.btnprev)
        val next=findViewById<ImageButton>(R.id.btnnext)

        prev.setOnClickListener{
            val idCurrentImageString="pic$currentimage"
            val idCurrentImageInt= this.resources.getIdentifier(idCurrentImageString,"id",packageName)

            image=findViewById(idCurrentImageInt)
            image.alpha=0f

            currentimage=(4+currentimage-1)%4

            val idImageToShowString="pic$currentimage"
            val idImageToShowInt= this.resources.getIdentifier(idImageToShowString,"id",packageName)

            image=findViewById(idImageToShowInt)
            image.alpha=1f


        }

        next.setOnClickListener{
            val idCurrentImageString="pic$currentimage"
            val idCurrentImageInt= this.resources.getIdentifier(idCurrentImageString,"id",packageName)

            image=findViewById(idCurrentImageInt)
            image.alpha=0f

            currentimage=(4+currentimage+1)%4

            val idImageToShowString="pic$currentimage"
            val idImageToShowInt= this.resources.getIdentifier(idImageToShowString,"id",packageName)

            image=findViewById(idImageToShowInt)
            image.alpha=1f
        }
    }
}