package com.example.claireb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.claireb.ui.theme.ClaireBTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClaireBTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                    //Components(name = Weather("19°","Bengaluru,India","Mid Rain","H:24° L:18"), image = "moon_cloud_mid_rain")
                    //Components(name = Weather("19°","Bengaluru,India","Mid Rain","H:24° L:18"), image = "moon_cloud_mid_rain")
                    Components2()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun Components2(modifier : Modifier=Modifier){
    LazyColumn(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(
                rememberScrollState()
            )
    ) {
        item{
            Column (modifier = Modifier
                .fillMaxWidth()
                .padding(25.dp)){
                Row(modifier = Modifier
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement  =  Arrangement.Absolute.SpaceBetween){
                    Text(
                        text = "Weather",
                        color = Color.White,
                        //style = MaterialTheme.typography.bodyLarge
                        fontFamily = sfProDisplayFamily,
                        //fontWeight = FontWeight.Normal,
                        fontSize = 28.sp,
                        lineHeight = 34.sp,
                        letterSpacing = 0.36.sp)
                    Spacer(modifier = Modifier.height(50.dp))
                    Image(
                        painter = painterResource(R.drawable.right_title),
                        contentDescription = null,
                        modifier= Modifier
                            .width(33.dp)
                            .height(34.dp))

                }
                Image(
                    painter = painterResource(R.drawable.search_field),
                    contentDescription = null,
                    modifier= Modifier
                        .width(358.dp)
                        .height(36.dp))
            }
        }
        item {
            Components(
                name = Weather("19°", "Bengaluru,India", "Mid Rain", "H:24° L:18"),
                image = "moon_cloud_mid_rain"
            )
            Spacer(modifier = Modifier.height(30.dp))
        }
        item{
            Components(name = Weather("22°","Chennai,India","Fast Wind","H:26° L:18"), image = "moon_fast_wind")
            Spacer(modifier = Modifier.height(30.dp))
        }
        item{
            Components(name = Weather("29°","Delhi,India","Cloudy","H:32° L:27"), image = "sun_cloud_angled_rain")
            Spacer(modifier = Modifier.height(30.dp))
        }
        item{
            Components(name = Weather("25°","Mumbai,India","Stormy","H:32° L:20"), image = "cloud_zap")
        }
    }
}

@Preview(showBackground = false)
@Composable
fun GreetingPreview() {
    ClaireBTheme {
        Components2()


    }
}