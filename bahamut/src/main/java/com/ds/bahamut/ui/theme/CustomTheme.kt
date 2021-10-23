package com.ds.bahamut.ui.theme

import androidx.compose.material.Colors
import androidx.compose.material.Typography
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import com.ds.bahamut.ui.theme.*


fun setAppTheme(
    lightColors: Colors,
    darkColors: Colors,
    typo: Typography = Typography
){
    CustomTheme.apply {
        light = lightColors
        dark = darkColors
        typography = typo
    }
}


object CustomTheme {
    var light = lightColors(
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

    var dark = darkColors(
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

    var typography = Typography
}
