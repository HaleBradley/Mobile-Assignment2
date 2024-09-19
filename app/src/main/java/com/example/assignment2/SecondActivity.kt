package com.example.assignment2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment2.ui.theme.Assignment2Theme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Assignment2Theme {
                Scaffold("Assignment 2", "Second Activity") { SecondContent { finish() } }
            }
        }
    }
}

@Composable
fun SecondContent(onClick: () -> Unit) {
    MobileChallenges()
    ReturnButton(onClick = { onClick() })
}

@Composable
fun MobileChallenges() {
    Column(
        verticalArrangement = Arrangement.spacedBy(30.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "1. Device Fragmentation",
                fontSize = 20.sp,
            )
            Text(
                text = "Creating apps that function on any device. This takes in screen sizes, hardware, and other limitations between devices.",
                fontSize = 12.sp,
            )
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "2. OS Fragmentation",
                fontSize = 20.sp,
            )
            Text(
                text = "Creating apps that work on different OS's, such as IOS and Android. You can use Native development to create apps for either OS or cross-platform development for both OS's.",
                fontSize = 12.sp,
            )
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "3. Rapid Changes",
                fontSize = 20.sp,
            )
            Text(
                text = "OS's have constant updates, some that are code breaking. As a developer, you have to keep up with these changes and fix apps accordingly.",
                fontSize = 12.sp,
            )
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "4. Tool Support",
                fontSize = 20.sp,
            )
            Text(
                text = "Since mobile software development needs new packages/tools to create application compared to desktop applications, there is a lack of tools that can be used in the development process making it slower than desktop/web applications.",
                fontSize = 12.sp,
            )
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "5. Low Tolerance",
                fontSize = 20.sp,
            )
            Text(
                text = "There are a lot of apps on the PlayStore, making the app market very competitive. Ensuring your app stands out and runs better than the rest is key to succeed in the field.",
                fontSize = 12.sp,
            )
        }
    }
}

@Composable
fun ReturnButton(onClick: () -> Unit, modifier: Modifier = Modifier) {
    OutlinedButton(onClick = { onClick() }) {
        Text("Main Activity")
    }
}

@Preview(showBackground = true)
@Composable
fun SecondPreview() {
    Assignment2Theme {
        Scaffold("Assignment 2", "Second Activity") { SecondContent {} }
    }
}