package com.ds.bahamut.ui.components.tooltip

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.ds.bahamut.ui.components.utils.ArrowDirection
import com.ds.bahamut.ui.components.utils.TriangleShape


val triangleShapeSize = 24.dp

@Composable
fun TooltipComponent(
    text: String,
    color: Color = colors.primary,
    position: TooltipPosition = TooltipPosition.TOP
) {

    when (position) {
        TooltipPosition.TOP -> TooltipTop(text = text, color = color)
        TooltipPosition.BOTTOM -> TooltipBottom(text = text, color = color)
        TooltipPosition.LEFT -> TooltipLeft(text = text, color = color)
        TooltipPosition.RIGHT -> TooltipRight(text = text, color = color)
    }

}

@Composable
private fun TooltipTop(
    text: String,
    color: Color
) {
    Column {
        Balloon(text = text, color = color)
        TriangleShape(
            triangleSize = triangleShapeSize,
            color = color,
            arrowDirection = ArrowDirection.Down,
            modifier = Modifier.padding(start = 12.dp, bottom = 8.dp)
        )
    }
}


@Composable
private fun TooltipBottom(
    text: String,
    color: Color
) {

    Column {

        TriangleShape(
            triangleSize = triangleShapeSize,
            color = color,
            modifier = Modifier.padding(start = 12.dp, top = 8.dp)
        )
        Balloon(text = text, color = color)

    }
}


@Composable
private fun TooltipLeft(
    text: String,
    color: Color
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Balloon(text = text, color = color)
        TriangleShape(
            triangleSize = triangleShapeSize,
            color = color,
            arrowDirection = ArrowDirection.Right,
            modifier = Modifier.padding(end = 8.dp)
        )
    }
}


@Composable
private fun TooltipRight(
    text: String,
    color: Color
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        TriangleShape(
            triangleSize = triangleShapeSize,
            color = color,
            arrowDirection = ArrowDirection.Left,
            modifier = Modifier.padding(start = 8.dp)
        )
        Balloon(text = text, color = color)


    }
}

