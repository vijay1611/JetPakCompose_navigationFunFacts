package com.vijay.funfactsjpc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.vijay.funfactsjpc.ui.screens.FunFactsNAvigationGraph
import com.vijay.funfactsjpc.ui.screens.Routes
import com.vijay.funfactsjpc.ui.screens.UserInputScreen
import com.vijay.funfactsjpc.ui.screens.WelcomeScreen
import com.vijay.funfactsjpc.ui.theme.FunFactsJPCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen()
        setContent {
            FunFactsJPCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   FunFactsApp()
                }
            }
        }



    }
    @Composable
    fun FunFactsApp(){
            FunFactsNAvigationGraph()

    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FunFactsJPCTheme {
        Greeting("Android")
    }
}