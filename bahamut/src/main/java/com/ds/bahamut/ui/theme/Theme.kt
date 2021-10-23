package com.ds.bahamut.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable


@Composable
fun BahamutTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        CustomTheme.light
    } else {
        CustomTheme.dark
    }

    MaterialTheme(
        colors = colors,
        typography = CustomTheme.typography,
        shapes = Shapes,
        content = content
    )
}




