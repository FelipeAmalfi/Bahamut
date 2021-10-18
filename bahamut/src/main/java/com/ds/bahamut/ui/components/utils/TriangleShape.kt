package com.ds.bahamut.ui.components.utils

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


sealed class ArrowDirection(val degrees: Float){
    object Up: ArrowDirection(0f)
    object Right: ArrowDirection(90f)
    object Down: ArrowDirection(180f)
    object Left: ArrowDirection(270f)
}

@Composable
fun TriangleShape(
    arrowDirection: ArrowDirection = ArrowDirection.Up,
    triangleSize: Dp,
    color: Color,
    modifier: Modifier =  Modifier
) {
    Canvas(modifier = Modifier
        .size(triangleSize).composed { modifier }
    ) {
        val path = Path()
        path.moveTo(0f, size.height)
        path.lineTo(size.width/2, 0f)
        path.lineTo(size.width, size.height)
        path.lineTo(0f, size.height)

        rotate(arrowDirection.degrees){
            drawPath(
                path = path,
                brush = SolidColor(color),
            )
        }
    }
}