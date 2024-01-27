package com.example.claireb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
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
fun Text_Bonus(name: WeatherBonus, precipitation : String = "", background : String = "", modifier: Modifier = Modifier) {
    //Spacer(modifier = Modifier.height(30.dp))
    Box{
        if(background=="light_hour")
        {
            Image(

                painter = painterResource(R.drawable.light_hour),
                contentDescription = null,
                //modifier = Modifier.size(333.dp)
                modifier = Modifier
                    .width(70.dp)
                    .height(166.dp)

            )
        }
        else
        {
            Image(

                painter = painterResource(R.drawable.black_hour),
                contentDescription = null,
                //modifier = Modifier.size(333.dp)
                modifier = Modifier
                    .width(70.dp)
                    .height(166.dp)

            )
        }
        Column (verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(12.dp)
            //verticalArrangement = Arrangement.Center
        ){
            Spacer(modifier = Modifier.height(15.dp))
            //Spacer(modifier = Modifier.width(20.dp))

            Text(
                text = name.heure,
                //color = MaterialTheme.colorScheme.primary,
                color = Color.White,
                //style = MaterialTheme.typography.bodyLarge
                fontFamily = sfProDisplayFamily,
                //fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                lineHeight = 20.sp,
                letterSpacing = -0.5.sp
            )
            Spacer(modifier = Modifier.height(35.dp))
            Text(
                    text = precipitation,
            //color = MaterialTheme.colorScheme.primary,
            color = Color(64,203,216),
            //style = MaterialTheme.typography.labelSmall
            fontFamily = sfProDisplayFamily,
            fontWeight = FontWeight.Bold,

            fontSize = 13.sp,
            lineHeight = 18.sp,
            letterSpacing = -0.08.sp
            )
            Spacer(modifier = Modifier.height(5.dp))
            //Spacer(modifier = Modifier.width(10.dp))
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
fun ImageComponentBonus(image: String, modifier: Modifier = Modifier){
    if(image=="moon_cloud_mid_rain"){
        Image(
            painter = painterResource(R.drawable.moon_cloud_mid_rain),
            contentDescription = null,
            modifier = Modifier
                .width(38.dp)
                .height(38.dp)
                .offset(10.5.dp, 52.dp)
        )
    }else if(image=="moon_fast_wind"){
        Image(
            painter = painterResource(R.drawable.moon_fast_wind),
            contentDescription = null,
            modifier = Modifier
                .width(38.dp)
                .height(38.dp)
                .offset(10.5.dp, 52.dp)
        )
    }else if(image=="cloud_zap"){
        Image(
            painter = painterResource(R.drawable.cloud_zap),
            contentDescription = null,
            modifier = Modifier
                .width(38.dp)
                .height(38.dp)
                .offset(10.5.dp, 52.dp)
        )
    }else if(image=="moon_cloud_fast_wind"){
        Image(
            painter = painterResource(R.drawable.moon_cloud_fast_wind),
            contentDescription = null,
            modifier = Modifier
                .width(28.dp)
                .height(28.dp)
                .offset(16.dp,57.dp)
        )
    }else{
        Image(
            painter = painterResource(R.drawable.sun_cloud_angled_rain),
            contentDescription = null,
            modifier = Modifier
                .width(38.dp)
                .height(38.dp)
                .offset(10.5.dp, 52.dp)
        )
    }
}

@Composable
fun SmallComponentBonus(name: WeatherBonus, image: String, precipitation : String = "",background : String = "", modifier: Modifier = Modifier) {
    Box{
        Text_Bonus(name = name, precipitation,background)
        ImageComponentBonus(image)
    }
}

@Preview(showBackground = false)
@Composable
fun GreetingPreview3() {
    ClaireBTheme {
        //Text_Bonus(WeatherBonus("12 PM","19°"),"30%")
        SmallComponentBonus(name = WeatherBonus("12 PM"," 19°"), image ="moon_cloud_fast_wind","  30%",)
    }
}