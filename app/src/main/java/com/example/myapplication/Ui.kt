package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.CustomGreen
import com.example.myapplication.ui.theme.MyApplicationTheme

class Ui : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Home(innerPadding)
                }
            }
        }
    }
}

@Composable
fun Home(innerPadding: PaddingValues) {
    Column(modifier = Modifier
        .padding(innerPadding)
        .fillMaxSize()
        .background(color = CustomGreen)
    ) {
        Column(
            horizontalAlignment = Alignment.End,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 20.dp)
        ) {
            Image(
                painterResource(R.drawable.nick),contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(60.dp)
                    .width(60.dp)
                    .clip(shape = RoundedCornerShape(50.dp))

            )

        }
        Column {
            Text(
                text = "Card", style = TextStyle(
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            )
            Text(
                text = "Simple and easy to use app",
                fontSize = 16.sp,
                color = Color.White
            )
        }

        //card 1
        Row(
            modifier = Modifier
                .padding(start = 0.dp, top = 25.dp, end = 2.dp, bottom = 2.dp),
        ) {
            Card(modifier =
                Modifier.
                height(150.dp).weight(1f),
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Column (
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {

                    Image(
                        painterResource(R.drawable.word), contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .height(80.dp)
                            .width(80.dp)


                    )
                    Text(
                        text = "Text", style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                    )
                }

            }
            Spacer(modifier = Modifier.width(15.dp))
            Card(modifier = Modifier.height(150.dp).weight(1f)) {
                Column (
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally

                ){

                    Image(
                        painterResource(R.drawable.add), contentDescription = null,
                        modifier = Modifier
                            .height(80.dp)
                            .width(80.dp)

                    )



                    Text(
                        text = "Address", style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                    )
                }
            }

        }

        Spacer(modifier = Modifier.height(15.dp))

        // card 2
        Row {
            Card(modifier = Modifier.height(150.dp).weight(1f)) {
                Column (
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally

                ){

                    Image(
                        painterResource(R.drawable.persona), contentDescription = null,
                        modifier = Modifier
                            .height(80.dp)
                            .width(80.dp)

                    )
                    Text(
                        text = "Character", style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                    )
                }

            }
            Spacer(modifier = Modifier.width(15.dp))
            Card(modifier = Modifier.height(150.dp).weight(1f)) {
                Column (
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally

                ){
                    Image(
                        painterResource(R.drawable.atm), contentDescription = null,
                        modifier = Modifier
                            .height(80.dp)
                            .width(80.dp)

                    )
                    Text(
                        text = "Bank Card", style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                    )
                }
            }

        }

        Spacer(modifier = Modifier.height(15.dp))

        // card 3
        Row {
            Card(modifier = Modifier.height(150.dp).weight(1f)) {
                Column (
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {
                    Image(
                        painterResource(R.drawable.password), contentDescription = null,
                        modifier = Modifier
                            .height(80.dp)
                            .width(80.dp)

                    )
                    Text(
                        text = "Password", style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                    )
                }

            }
            Spacer(modifier = Modifier.width(15.dp))
            Card(modifier = Modifier.height(150.dp).weight(1f)) {
                Column (
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {
                    Image(
                        painterResource(R.drawable.logi), contentDescription = null,
                        modifier = Modifier
                            .height(80.dp)
                            .width(80.dp)

                    )
                    Text(
                        text = "Logistics", style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                    )
                }
            }

        }

        Spacer(modifier = Modifier.height(15.dp))

        Row{
            Card(modifier = Modifier.height(100.dp).weight(1f)) {

                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 10.dp, vertical = 20.dp),
                    verticalAlignment = Alignment.CenterVertically, // Center vertically
                    horizontalArrangement = Arrangement.Start // Start horizontally
                ) {

                    Image(
                        painterResource(R.drawable.setting), contentDescription = null,
                        modifier = Modifier
                            .height(60.dp)
                            .width(60.dp)

                    )





                    Text(
                        text = "Setting", style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                    )
                }
                


            }
        }



    }

}

@Preview(showBackground = true)
@Composable
fun Dashboardpreveiw() {
   Home(innerPadding = PaddingValues(0.dp))
}