package com.example.testifyapp

import SettingsScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Contacts
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.testifyapp.ui.theme.TestifyAppTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            TestifyAppTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        TopAppBar(
//                            colors = TopAppBarDefaults.topAppBarColors(
//                                containerColor = MaterialTheme.colorScheme.primaryContainer,
//                                titleContentColor = MaterialTheme.colorScheme.primary,
//                            ),
                            title = {
                                Row(
                                    modifier = Modifier.fillMaxWidth().padding(16.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text("Biblia Testify")

                                    Row {
                                        IconButton(onClick = { /* do something */ }) {
                                            Icon(
                                                painter = painterResource(id =  R.drawable.user),
                                                contentDescription = "user",
                                                tint = colorResource(id = R.color.burgundy),
                                            )
                                        }
                                        //SETINGS BUTTON
                                        IconButton(onClick = {
                                            navController.navigate(TestifyRoutes.Settings.name)
                                        }) {
                                            Icon(
                                                painter = painterResource(id =  R.drawable.settings),
                                                contentDescription = "Settings",
                                                tint = colorResource(id = R.color.burgundy),
                                            )
                                        }
                                    }


                                }
                            }
                        )
                    },
                    bottomBar = {
                        BottomAppBar(
                            actions = {
                                Row(
                                    modifier = Modifier.fillMaxWidth().padding(16.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ){
                                    Column {
                                        IconButton(onClick = { /* do something */ }) {
                                            Icon(
                                                painter = painterResource(id =  R.drawable.home),
                                                contentDescription = "Acasa",
                                                tint = colorResource(id = R.color.burgundy),
                                            )
                                        }
                                        Text("Acasa")
                                    }
                                    Column {
                                        IconButton(onClick = { /* do something */ }) {
                                            Icon(
                                                painter = painterResource(id =  R.drawable.book_open),
                                                contentDescription = "Citeste",
                                                tint = colorResource(id = R.color.burgundy),
                                            )
                                        }
                                        Text("Citeste")
                                    }
                                    Column {
                                        IconButton(onClick = { /* do something */ }) {
                                            Icon(
                                                painter = painterResource(id =  R.drawable.graduate),
                                                contentDescription = "Testeaza",
                                                tint = colorResource(id = R.color.burgundy),
                                            )
                                        }
                                        Text("Testeaza")
                                    }
                                }

                            },

                        )
                    },
                ) { innerPadding ->
                    print(innerPadding)

                    NavHost(
                        navController = navController,
                        startDestination = TestifyRoutes.Settings.name,
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        composable(route = TestifyRoutes.Settings.name) {
                            SettingsScreen()
                        }
                    }

                    HomeView(modifier = Modifier.padding(top = innerPadding.calculateTopPadding(), bottom = innerPadding.calculateBottomPadding()))
                }
            }
        }
    }
}







//Navigation Between Screens

enum class TestifyRoutes(){
   Settings,
}













