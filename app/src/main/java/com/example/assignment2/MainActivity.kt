package com.example.assignment2

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.assignment2.ui.theme.Assignment2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Assignment2Theme {
                Scaffold("Assignment 2", "Main Activity") { MainContent(onClickExplicitly = { startSecondActivityExplicitly() }, onClickImplicitly = { startSecondActivityImplicitly() }) }
            }
        }
    }

    private fun startSecondActivityExplicitly() {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

    private fun startSecondActivityImplicitly() {
        val intent = Intent("com.example.SECOND_ACTIVITY")
        startActivity(intent)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Scaffold(topBarText: String, bottomBarText: String, content: @Composable () -> Unit){
    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        text = topBarText,
                    )
                }
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.primary,
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    text = bottomBarText,
                )
            }
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth()
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
        ) {
            content()
        }

    }
}

@Composable
fun MainContent(onClickExplicitly: () -> Unit, onClickImplicitly: () -> Unit) {
    Name()
    Buttons(onClickExplicitly = { onClickExplicitly() }, onClickImplicitly = { onClickImplicitly() })
}

@Composable
fun Name(modifier: Modifier = Modifier) {
    Text(
        text = "Hale Bradley\n1226530",
        modifier = modifier
    )
}

@Composable
fun Buttons(onClickExplicitly: () -> Unit, onClickImplicitly: () -> Unit ,modifier: Modifier = Modifier) {
    Column {
        OutlinedButton(onClick = { onClickExplicitly() }) {
            Text("Start Activity Explicitly")
        }
        OutlinedButton(onClick = { onClickImplicitly() }) {
            Text("Start Activity Implicitly")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainPreview() {
    Assignment2Theme {
        Scaffold("Assignment 2", "Main Activity") { MainContent(onClickExplicitly = {}, onClickImplicitly = {}) }
    }
}