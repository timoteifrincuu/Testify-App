package com.example.testifyapp

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
import com.example.testifyapp.ui.theme.TestifyAppTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TestifyAppTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        TopAppBar(
                            colors = TopAppBarDefaults.topAppBarColors(
                                containerColor = MaterialTheme.colorScheme.primaryContainer,
                                titleContentColor = MaterialTheme.colorScheme.primary,
                            ),
                            title = {
                                Row(
                                    modifier = Modifier.fillMaxWidth().padding(16.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text("Biblia Testify")
                                    Icon(
                                        painter = painterResource(id =  R.drawable.user),
                                        contentDescription = "user",
                                        tint = colorResource(id = R.color.burgundy),
                                    )
                                    Icon(
                                        painter = painterResource(id =  R.drawable.settings),
                                        contentDescription = "Settings",
                                        tint = colorResource(id = R.color.burgundy),
                                    )
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
                                            Icon(Icons.Filled.Home,
                                                contentDescription = "Acasa",
                                                tint = colorResource(id = R.color.burgundy)
                                                )
                                        }
                                        Text("Acasa")
                                    }
                                    Column {
                                        IconButton(onClick = { /* do something */ }) {
                                            Icon(Icons.Filled.Book,
                                                contentDescription = "Book",
                                                tint = colorResource(id = R.color.burgundy)
                                                )
                                        }
                                        Text("Citeste")
                                    }
                                    Column {
                                        IconButton(onClick = { /* do something */ }) {
                                            Icon(Icons.Filled.School,
                                                contentDescription = "School",
                                                tint = colorResource(id = R.color.burgundy)
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

                    HomeView(modifier = Modifier.padding(top = innerPadding.calculateTopPadding()))
                }
            }
        }
    }
}
