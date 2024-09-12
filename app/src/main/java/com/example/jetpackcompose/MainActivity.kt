package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
setContent {
    myComponent()
}

    }

    @Composable
    fun image(){
        Image(
            painterResource(R.drawable.ic_launcher_foreground),
            "testing image")

    }

    @Composable
    fun myText(text:String)=Text(text)

    @Composable
    fun myTexts(){
       Column {
           myText("Hi Jetpack compose.!!")
           myText("Ready.?")
       }
    }

    @Composable
    fun myComponent(){
        Row {
            image()
            myTexts()
        }
    }

    @Preview
    @Composable
    fun getPreview(){
        myComponent()
    }












}



