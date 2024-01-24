package com.example.claireb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.claireb.ui.theme.ClaireBTheme

class SecondPageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClaireBTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Text_Bonus(WeatherBonus("12 PM","19°"))
                }
            }
        }
    }
}

data class WeatherBonus(val heure: String, val temperature: String)

@Composable
fun Text_Bonus(name: WeatherBonus, modifier: Modifier = Modifier) {
    //Spacer(modifier = Modifier.height(30.dp))
    Box{
        Image(

            painter = painterResource(R.drawable.rectangle),
            contentDescription = null,
            //modifier = Modifier.size(333.dp)
            modifier = Modifier
                .width(60.dp)
                .height(145.dp)

        )
        Column (verticalArrangement = Arrangement.Bottom,
            //verticalArrangement = Arrangement.Center
        ){
            //Spacer(modifier = Modifier.height(8.dp))
            //Spacer(modifier = Modifier.width(20.dp))

            Text(
                text = name.heure,
                //color = MaterialTheme.colorScheme.primary,
                color = Color.White,
                //style = MaterialTheme.typography.bodyLarge
                fontFamily = sfProDisplayFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                lineHeight = 20.sp,
                letterSpacing = -0.5.sp
            )
            //Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = name.temperature,
                //color = MaterialTheme.colorScheme.primary,
                color = Color.White,
                //style = MaterialTheme.typography.labelSmall
                fontFamily = sfProDisplayFamily,
                //fontWeight = FontWeight.Bold,

                fontSize = 20.sp,
                lineHeight = 24.sp,
                letterSpacing = 0.38.sp
            )

        }
    }

}



@Composable
fun SmallComponentBonus(name: WeatherBonus, image: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = false)
@Composable
fun GreetingPreview3() {
    ClaireBTheme {
        Text_Bonus(WeatherBonus("12 PM","19°"))
    }
}