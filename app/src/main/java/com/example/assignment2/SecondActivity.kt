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
                text = "1. Platforms",
                fontSize = 20.sp,
            )
            Text(
                text = "There are many different platforms for mobile software developers to use, so it would be a useful challenge to go and familiarize themselves with a native platform for Android and IOS, as well as a cross-platform that can be used to create application on both at the same time.",
                fontSize = 12.sp,
            )
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "2. Languages",
                fontSize = 20.sp,
            )
            Text(
                text = "From Swift to Kotlin, learning new languages in the field of mobile development can be a great challenge for beginners.",
                fontSize = 12.sp,
            )
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "3. UI/UX Design",
                fontSize = 20.sp,
            )
            Text(
                text = "Whether it be looking at wireframes for app layouts, or creating your own, finding a way to design UI efficiently can be a good challenge.",
                fontSize = 12.sp,
            )
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "4. Testing",
                fontSize = 20.sp,
            )
            Text(
                text = "Everyone can write code, but not everyone test's it. Writing test for a pre-made application or one you created yourself can help you in all future mobile development projects.",
                fontSize = 12.sp,
            )
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "5. Portfolio Project",
                fontSize = 20.sp,
            )
            Text(
                text = "Create a basic application that lists all the projects you have created, a brief descriptions for the project, and a link to the repo for viewing.",
                fontSize = 12.sp,
            )
        }
    }
}

@Composable
fun ReturnButton(onClick: () -> Unit, modifier: Modifier = Modifier) {
    OutlinedButton(onClick = { onClick() }) {
        Text("Go back to Main Activity")
    }
}

@Preview(showBackground = true)
@Composable
fun SecondPreview() {
    Assignment2Theme {
        Scaffold("Assignment 2", "Second Activity") { SecondContent {} }
    }
}