package com.example.projecttest

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Находим наши компоненты с формы по ID
        val ButtonShow: Button = findViewById(R.id.showbutton)
        val myImage: ImageView = findViewById(R.id.imageView)
        val ButtonClose: Button = findViewById(R.id.closebutton)

        // 2. Устанавливаем слушатель нажатия на кнопку
        ButtonShow.setOnClickListener {
            // При клике делаем картинку видимой на экране
            myImage.visibility = View.VISIBLE
            ButtonClose.visibility = View.VISIBLE
            ButtonShow.visibility = View.INVISIBLE
        }

        ButtonClose.setOnClickListener {
            myImage.visibility = View.INVISIBLE
            ButtonClose.visibility = View.INVISIBLE
            ButtonShow.visibility = View.VISIBLE
        }
    }
}
