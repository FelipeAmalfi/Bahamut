package com.ds.bahamut.ui.components.buttons

import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.*


val fixedButtonModifier = Modifier
    .fillMaxWidth()
    .height(50.dp)


@Composable
fun FixedButton(
    modifier: Modifier = Modifier,
    buttonColor: Color = colors.primary,
    buttonShape: Shape = RectangleShape,
    buttonListener: () -> Unit,
    content: @Composable () -> Unit
) {
    Button(
        onClick = { buttonListener() },
        modifier = fixedButtonModifier.composed { modifier },
        colors = ButtonDefaults.buttonColors(backgroundColor = buttonColor),
        shape = buttonShape
    ) {
        content()
    }
}


@Composable
fun FixedButton(
    modifier: Modifier = Modifier,
    buttonText: String,
    buttonColor: Color = colors.primary,
    textColor: Color = colors.onPrimary,
    buttonShape: Shape = RectangleShape,
    buttonIcon: ImageVector? = null,
    buttonListener: () -> Unit
) {
    Button(
        onClick = { buttonListener() },
        modifier = fixedButtonModifier.composed { modifier },
        colors = ButtonDefaults.buttonColors(backgroundColor = buttonColor),
        shape = buttonShape
    ) {
        buttonIcon?.let { icon ->
            Icon(
                imageVector = icon,
                contentDescription = "icon",
                modifier = Modifier.absolutePadding(right = 4.dp),
                tint = textColor
            )
        }

        Text(
            text = buttonText,
            color = textColor,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
    }
}



