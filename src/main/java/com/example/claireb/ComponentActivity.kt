package com.example.claireb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.claireb.ui.theme.ClaireBTheme


class BengaluruActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClaireBTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(Weather("19°","Bengaluru,India","Mid Rain","H:24° L:18"))
                }
            }
        }
    }
}

val sfProDisplayFamily = FontFamily(
    Font(R.font.sf_pro_display_regular, FontWeight.Normal),
    Font(R.font.sf_pro_display_bold, FontWeight.Bold),
)

data class Weather(val temperature: String, val localisation: String, val type: String, val range: String)

@Composable
fun GreetingText(name: Weather, modifier: Modifier = Modifier) {
    //Spacer(modifier = Modifier.height(30.dp))
    Image(
        painter = painterResource(R.drawable.rectangle),
        contentDescription = null,
        //modifier = Modifier.size(333.dp)
        modifier = Modifier.width(338.dp)
            .height(185.dp)


    )
    Column (modifier = Modifier.padding(20.dp)){
        //Spacer(modifier = Modifier.height(8.dp))
        //Spacer(modifier = Modifier.width(20.dp))
        Text(
            text = name.temperature,
            //color = MaterialTheme.colorScheme.primary,
            color = Color.White,
            //style = MaterialTheme.typography.bodyLarge
            fontFamily = sfProDisplayFamily,
            //fontWeight = FontWeight.Normal,
            fontSize = 64.sp,
            lineHeight = 70.sp,
            letterSpacing = 0.37.sp
            )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = name.range,
            //color = MaterialTheme.colorScheme.primary,
            color = MaterialTheme.colorScheme.surface.copy(alpha = 0.6f),
            //style = MaterialTheme.typography.labelSmall
            fontFamily = sfProDisplayFamily,
            //fontWeight = FontWeight.Medium,

            fontSize = 13.sp,
            lineHeight = 18.sp,
            letterSpacing = -0.08.sp
        )
        Row{
            Text(
                text = name.localisation,
                //color = MaterialTheme.colorScheme.primary,
                color = Color.White,
                //style = MaterialTheme.typography.titleLarge
                fontFamily = sfProDisplayFamily,
                //fontWeight = FontWeight.Normal,
                fontSize = 17.sp,
                lineHeight = 22.sp,
                letterSpacing = -0.41.sp
            )
            Spacer(modifier = Modifier.width(151.dp))
            Text(
                text = name.type,
                //color = MaterialTheme.colorScheme.primary,
                color = Color.White,
                //style = MaterialTheme.typography.titleLarge
                fontFamily = sfProDisplayFamily,
                //fontWeight = FontWeight.Normal,
                fontSize = 13.sp,
                lineHeight = 18.sp,
                letterSpacing = -0.08.sp
            )
        }
    }
}


@Preview(showBackground = false)
@Composable
fun GreetingPreview2() {
    ClaireBTheme {
        GreetingText(Weather("19°","Bengaluru,India","Mid Rain","H:24° L:18"))
    }
}