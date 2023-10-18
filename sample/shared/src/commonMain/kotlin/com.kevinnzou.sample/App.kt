package com.kevinnzou.sample

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun App() {
    MaterialTheme {
        BasicSwipeBoxSample()
//        SwipeBoxListSample()
    }
}

expect fun getPlatformName(): String