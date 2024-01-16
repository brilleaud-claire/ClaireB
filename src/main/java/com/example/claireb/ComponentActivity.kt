package com.example.claireb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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

data class Weather(val temperature: String, val localisation: String, val type: String, val range: String)



@Composable
fun GreetingText(name: Weather, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.drawable.rectangle),
        contentDescription = null,
        //modifier = Modifier.size(333dp)
    )

    Column {
        Text(
            text = name.temperature,
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.bodyLarge
            )
        Spacer(modifier = Modifier.height(54.dp))
        Text(
            text = name.range,
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.labelSmall
        )
        Text(
            text = name.localisation,
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.titleLarge

        )
    }
}

@Preview(showBackground = false)
@Composable
fun GreetingPreview2() {
    ClaireBTheme {
        GreetingText(Weather("19°","Bengaluru,India","Mid Rain","H:24° L:18"))
    }
}