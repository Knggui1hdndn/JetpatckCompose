package com.example.lesstion_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Main : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // rowColumns()
            imageCard()
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun imageCard() {
        val painter = painterResource(id = R.drawable.logo)
        val contentDescription = "Đây là mô tả"
        val title = "Đây là tiêu đề"
        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)) {
            ImageCard(
                painter = painter,
                contentDescription = contentDescription,
                title = title
            )
        }


    }

    @Composable
    fun ImageCard(
        painter: Painter,
        contentDescription: String,
        title: String,
        modifier: Modifier = Modifier
    ) {
        Card(
            modifier = modifier.fillMaxSize(0.5f),
            shape = RoundedCornerShape(15.dp),//boder view
        ) {
            Box(modifier = Modifier.fillMaxSize()) {
                Image(
                    painter = painter,
                    contentDescription = contentDescription,
                    contentScale = ContentScale.FillHeight
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = title,
                        style = TextStyle(color = Color.White, fontSize = 25.sp)
                    )
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    private fun rowColumns() {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,//Chia đều khoảng cách tối đa giữa các view
            // verticalArrangement = Arrangement.SpaceAround,//Chia đều khoảng cách  các view nhưng vẫn thừa khoảng trống hai đầu
            // verticalArrangement = Arrangement.SpaceEvenly,//Chia đều khoảng cách các view và với lề theo hướng (ngang/dọc) bằng nhau
            modifier = Modifier
                .background(Color.Blue)
                .fillMaxSize(1f)

            //.fillMaxWidth(0.5f)//Chiều rộng bằng 50% chiều rộng màn hình

        ) {//Căn giữa bên view con theo chiều ngang

            Text(
                text = "Hello",
                modifier = Modifier
                    .fillMaxWidth(1f)
                    //.offset(50.dp, 20.dp)//dịch sang phải 50 và xuống dưới 20 và không ảnh hưởng tới vị trí các view khác
                    .border(5.dp, Color.Black)
                    .padding(5.dp)
                    .align(Alignment.End),
                color = Color.White,
                fontSize = 25.sp
            )
            Text(
                text = "Đây là Column", color = Color.White,
                modifier = Modifier
            )
            Row() {
                Text(text = "Hello", color = Color.White)
                Text(text = "Đây là Row", color = Color.White)
            }
        }
    }


}


