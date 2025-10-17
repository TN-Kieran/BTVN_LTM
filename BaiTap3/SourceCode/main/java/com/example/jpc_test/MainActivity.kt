package com.example.jpc_test

import android.os.Bundle
import android.preference.PreferenceActivity
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.style.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.*

import androidx.compose.ui.text.*
import androidx.compose.ui.res.*
import coil.compose.*
import androidx.compose.ui.layout.*
import androidx.compose.foundation.shape.*
import androidx.compose.runtime.*

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

//---BT----//
import com.example.jpc_test.BT1.WelcomeScreen
import com.example.jpc_test.BT1.UIComponentsScreen
import com.example.jpc_test.BT1.HeaderAppBar
import com.example.jpc_test.BT1.ImagesScreen
import com.example.jpc_test.BT1.RowLayoutScreen
import com.example.jpc_test.BT1.TextDetailScreen
import com.example.jpc_test.BT1.TextFieldScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppNavigator()
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    JPC_TestTheme {
//        Greeting("Android")
//    }
//}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen(navController = rememberNavController())
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun UIComponentsScreenPreview(){
    UIComponentsScreen(navController = rememberNavController())
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TextDetailScreenPreview(){
    TextDetailScreen(navController = rememberNavController())
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ImagesScreenReview(){
    ImagesScreen(navController = rememberNavController())
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TextFieldScreenPreview(){
    TextFieldScreen(navController = rememberNavController())
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RowLayputScreenPreview(){
    RowLayoutScreen(navController = rememberNavController())
}
@Composable
fun AppNavigator() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "welcome" // Đặt màn hình bắt đầu là "onboarding"
    ) {
        composable("welcome") {
            WelcomeScreen(navController)
        }
        composable("uiComponents") {
            UIComponentsScreen(navController)
        }
        composable("imagesScreen") {
            ImagesScreen(navController)
        }
        composable("rowLayoutScreen") {
            RowLayoutScreen(navController)
        }
        composable("textDetailScreen") {
            TextDetailScreen(navController)
        }
        composable("textFieldScreen") {
            TextFieldScreen(navController)
        }
    }
}
