package com.example.claireb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.claireb.ui.theme.ClaireBTheme
import com.example.claireb.ui.theme.Display

class MainActivity : ComponentActivity() {
    lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClaireBTheme {
                // A surface container using the 'background' color from the theme
                navController=rememberNavController()
                SetupNavGraph(navController = navController)

            }
        }
    }
}

@Preview(showBackground = false)
@Composable
fun GreetingPreview() {
    ClaireBTheme {
        //Components2()
        Display()
    }
}