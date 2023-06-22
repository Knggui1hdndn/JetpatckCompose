package com.example.lesstion_1

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.lesstion_1.ui.theme.Lesstion_1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(

                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween,//Chia đều khoảng cách tối đa giữa các view
                // verticalArrangement = Arrangement.SpaceAround,//Chia đều khoảng cách  các view nhưng vẫn thừa khoảng trống hai đầu
                // verticalArrangement = Arrangement.SpaceEvenly,//Chia đều khoảng cách các view và với lề theo hướng (ngang/dọc) bằng nhau

                modifier = Modifier
                    .background(Color.Blue)
                    .fillMaxWidth(0.5f)//Chiều rộng bằng 50% chiều rộng màn hình


            ) {//Căn giữa bên view con theo chiều ngang
                Text(text = "Hello")
                Text(text = "Đây là Column")
                Row() {
                    Text(text = "Hello")
                    Text(text = "Đây là Row")
                }
            }

        }
    }
}


