package com.example.claireb.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.claireb.R
import com.example.claireb.SmallComponentBonus
import com.example.claireb.WeatherBonus
import com.example.claireb.sfProDisplayFamily
import com.example.claireb.ui.theme.ui.theme.ClaireBTheme

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
                    Greeting2("Android")
                }
            }
        }
    }
}

@Composable
fun Display(modifier: Modifier = Modifier){
    Box(modifier=Modifier.fillMaxWidth()){
        Image(
            painter = painterResource(R.drawable.starry_mountain),
            contentDescription = null,
            modifier = Modifier
                .width(430.dp)
                .height(924.dp)
                //.fillMaxWidth()
                //.fillMaxHeight()
        )
        Image(
            painter = painterResource(R.drawable.house),
            contentDescription = null,
            modifier = Modifier
                .width(390.dp)
                .height(390.dp)
                .offset(x=20.dp,y = 304.dp)

        )
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 71.dp)
        ){
            Text(
                text = "Bengaluru",
                //color = MaterialTheme.colorScheme.primary,
                color = Color.White,
                //style = MaterialTheme.typography.labelSmall
                fontFamily = sfProDisplayFamily,
                //fontWeight = FontWeight.Bold,

                fontSize = 34.sp,
                lineHeight = 41.sp,
                letterSpacing = 0.37.sp
            )

            Text(
                text = "19°",
                //color = MaterialTheme.colorScheme.primary,
                color = Color.White,
                //style = MaterialTheme.typography.labelSmall
                fontFamily = sfProDisplayFamily,
                fontWeight = FontWeight.Light,

                fontSize = 96.sp,
                lineHeight = 40.sp,
                letterSpacing = 0.37.sp
            )
            Text(
                text = "Mostly Clear",
                //color = MaterialTheme.colorScheme.primary,
                color = Color.White.copy(alpha = 0.6f),
                //style = MaterialTheme.typography.labelSmall
                fontFamily = sfProDisplayFamily,
                fontWeight = FontWeight.SemiBold,

                fontSize = 20.sp,
                lineHeight = 24.sp,
                letterSpacing = 0.38.sp
            )
            Text(
                text = "H:24°  L:18°",
                //color = MaterialTheme.colorScheme.primary,
                color = Color.White,
                //style = MaterialTheme.typography.labelSmall
                fontFamily = sfProDisplayFamily,
                fontWeight = FontWeight.Normal,

                fontSize = 20.sp,
                lineHeight = 24.sp,
                letterSpacing = 0.38.sp
            )

        }
        Spacer(modifier = Modifier.height(519.dp))
        DayWeather()
    }
}

@Composable
fun DayWeather(modifier: Modifier = Modifier){
    Box(modifier=Modifier.offset(y=510.dp)){
        Image(
            painter = painterResource(R.drawable.model),
            contentDescription = null,
            modifier = Modifier
                .width(430.dp)
                .height(375.dp)
                //.fillMaxWidth()
        )
        Image(
            painter = painterResource(R.drawable.segmented_control),
            contentDescription = null,
            modifier = Modifier
                .width(430.dp)
                .height(59.dp)
                .offset(y=20.dp)
        )
        LazyRow(modifier = Modifier.offset(y=90.dp)
            ){
            item {
                Spacer(modifier=Modifier.width(20.dp))
                SmallComponentBonus(name = WeatherBonus("12 PM"," 19°"), image ="moon_cloud_mid_rain","  30%")
            }
            item {
                SmallComponentBonus(name = WeatherBonus("  Now"," 20°"), image ="moon_cloud_fast_wind","","light_hour" )
            }
            item {
                SmallComponentBonus(name = WeatherBonus(" 2 PM"," 22°"), image ="sun_cloud_angled_rain" )
            }
            item {
                SmallComponentBonus(name = WeatherBonus(" 3 PM"," 20°"), image ="moon_cloud_fast_wind" )
            }
            item {
                SmallComponentBonus(name = WeatherBonus(" 4 PM"," 19°"), image ="moon_cloud_mid_rain","  40%")
            }
            item {
                SmallComponentBonus(name = WeatherBonus(" 5 PM"," 18°"), image ="moon_cloud_mid_rain","  40%")
            }
            item {
                SmallComponentBonus(name = WeatherBonus(" 6 PM"," 15°"), image ="moon_cloud_mid_rain","  20%")
                Spacer(modifier=Modifier.width(20.dp))
            }

        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = false)
@Composable
fun GreetingPreview4() {
    ClaireBTheme {
        //Greeting2("Android")
        //DayWeather()
        Display()
    }
}