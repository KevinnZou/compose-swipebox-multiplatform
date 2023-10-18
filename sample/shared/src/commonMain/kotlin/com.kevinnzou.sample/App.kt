package com.kevinnzou.sample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun App() {
    MaterialTheme {
        mainScreen()
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun mainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 15.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SwipeBoxAtEnd()
        Spacer()
        SwipeBoxAtStart()
        Spacer()
        SwipeBoxAtEnd2()
        Spacer()
        SwipeBoxAtBoth()
        Spacer()
        SwipeBoxWithText()
        Spacer()
    }
}

@Composable
fun Spacer() {
    Spacer(modifier = Modifier.height(15.dp))
}

expect fun getPlatformName(): String