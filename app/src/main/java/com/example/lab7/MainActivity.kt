package com.example.lab7

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import com.example.lab7.ui.theme.LAB7Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LAB7Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    //Bai 1
//                    val mainViewModel: MainViewModel by viewModels()
//                    val moviesState = mainViewModel.movies.observeAsState(initial = emptyList())
//                    MovieScreen(moviesState.value)

                    //Bai 2
                    ScreenNavigation()
                }
            }
        }
    }
}

