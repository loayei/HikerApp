package com.example.hikerapp

import android.os.Bundle
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    //Variables
    private lateinit var topAnim:Animation
    private lateinit var bottomAnim:Animation
    private lateinit var image1:ImageView
    private lateinit var image2:ImageView
    private lateinit var logo:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)

        //Animations
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation)
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation)

        //Applying the animations
        image1 = findViewById(R.id.imageView)
        image2 = findViewById(R.id.imageView1)
        logo = findViewById(R.id.textView)

        image1.animation = topAnim
        logo.animation = bottomAnim
        image2.animation = bottomAnim



    }
}