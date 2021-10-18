package com.ds.bahamut.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable


private val LightThemeDefault = lightColors(
    primary = Blue500,
    primaryVariant = BlueGray700,
    secondary = GrayBlue900,
    secondaryVariant = GrayBlue800,
    background = Gray50,
    surface = Gray50,
    error = Red500,
    onPrimary = Gray900,
    onSecondary = Gray50,
    onBackground = Gray900,
    onSurface = Gray900,
    onError = Gray50
)

private val DarkThemeDefault = darkColors(
    primary = Blue500,
    primaryVariant = BlueGray700,
    secondary = GrayBlue900,
    secondaryVariant = GrayBlue800,
    background = Gray900,
    surface = Gray800,
    error = Red500,
    onPrimary = Gray900,
    onSecondary = Gray50,
    onBackground = Gray50,
    onSurface = Gray50,
    onError = Gray50
)


@Composable
fun BahamutTheme(
    lightThemePalette: Colors = LightThemeDefault,
    darkThemePalette: Colors = DarkThemeDefault,
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        lightThemePalette
    } else {
        darkThemePalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}




