package com.kevinnzou.swipebox.widget

import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

/**
 * Created By Kevin Zou On 2023/10/18
 */
@Composable
fun RowScope.SwipeText(
    background: Color = Color.White,
    weight: Float = 1f,
    onClick: () -> Unit,
    text: @Composable () -> Unit,
) {
    SwipeContent(
        background = background,
        weight = weight,
        onClick = onClick
    ) {
        text()
    }
}