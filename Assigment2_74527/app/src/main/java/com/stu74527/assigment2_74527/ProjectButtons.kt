package com.stu74527.assigment2_74527


import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun ToScreen2Button(onClick: () -> Unit) {
    ElevatedButton(onClick = { onClick() }) {
        Text("Screen 2")
    }
}

@Composable
fun ToScreen3Button(onClick: () -> Unit) {
    ElevatedButton(onClick = { onClick() }) {
        Text("Screen 3")
    }
}

@Composable
fun ToHomeButton(onClick: () -> Unit) {
    ElevatedButton(onClick = { onClick() }) {
        Text("Home")
    }
}

@Composable
fun ToMainScreen(onClick: () -> Unit) {
    ElevatedButton(onClick = { onClick() }) {
        Text("Go Back")
    }
}

@Composable
fun ToInformationScreen(onClick: () -> Unit){
    ElevatedButton(onClick = { onClick() }) {

    }
}