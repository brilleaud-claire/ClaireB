package com.example.claireb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.claireb.ui.theme.ClaireBTheme
import com.example.claireb.ui.theme.Purple0
import com.example.claireb.ui.theme.Purple1

class HomePageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClaireBTheme {

            }
        }
    }
}

@Composable
fun Greeting3(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun Background(modifier : Modifier=Modifier){
    var grad = Brush.verticalGradient(listOf(Purple0, Purple1))
    Box(modifier = Modifier
        .background(grad)
        .offset(y = -10.dp)){
        Image( painter = painterResource(R.drawable.ellipse_haut),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .offset(y = -130.dp)
        )
        Spacer(modifier = Modifier.height(5.dp))
        Image( painter = painterResource(R.drawable.ellipse_bas),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .offset(0.dp, 130.dp)
        )
    }
}


@Composable
fun Components2(navController : NavController,modifier : Modifier=Modifier){

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background

    ) {
        Background()
        //Greeting("Android")
        //Components(name = Weather("19°","Bengaluru,India","Mid Rain","H:24° L:18"), image = "moon_cloud_mid_rain")
        //Components(name = Weather("19°","Bengaluru,India","Mid Rain","H:24° L:18"), image = "moon_cloud_mid_rain")
        LazyColumn(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
            //.verticalScroll(
            //   rememberScrollState()
            //)
        ) {
            item{
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(25.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.Top,
                        horizontalArrangement = Arrangement.Absolute.SpaceBetween
                    ) {
                        Text(
                            text = "Weather",
                            color = Color.White,
                            //style = MaterialTheme.typography.bodyLarge
                            fontFamily = sfProDisplayFamily,
                            //fontWeight = FontWeight.Normal,
                            fontSize = 28.sp,
                            lineHeight = 34.sp,
                            letterSpacing = 0.36.sp
                        )
                        Spacer(modifier = Modifier.height(50.dp))
                        Image(
                            painter = painterResource(R.drawable.right_title),
                            contentDescription = null,
                            modifier = Modifier
                                .width(33.dp)
                                .height(34.dp)
                        )

                    }
                    Image(
                        painter = painterResource(R.drawable.search_field),
                        contentDescription = null,
                        modifier = Modifier
                            .width(358.dp)
                            .height(36.dp)
                    )
                }
            }
            item {

                Components(
                    name = Weather("19°", "Bengaluru,India", "Mid Rain", "H:24° L:18"),
                    image = "moon_cloud_mid_rain", navController
                    )
                Spacer(modifier = Modifier.height(30.dp))
            }
            item {
                Components(
                    name = Weather("22°", "Chennai,India", "Fast Wind", "H:26° L:18"),
                    image = "moon_fast_wind",navController
                )
                Spacer(modifier = Modifier.height(30.dp))

            }
            item {
                Components(
                    name = Weather("29°", "Delhi,India", "Cloudy", "H:32° L:27"),
                    image = "sun_cloud_angled_rain",navController
                )
                Spacer(modifier = Modifier.height(30.dp))
            }
            item{
                Components(
                    name = Weather("25°", "Mumbai,India", "Stormy", "H:32° L:20"),
                    image = "cloud_zap",navController
                )
            }
        }
    }

}
@Preview(showBackground = true)
@Composable
fun GreetingPreview5() {
    ClaireBTheme {
        //Greeting3("Android")
        Components2(navController = rememberNavController())
    }
}