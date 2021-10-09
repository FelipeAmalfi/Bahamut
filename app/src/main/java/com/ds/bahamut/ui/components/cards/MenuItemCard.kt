package com.ds.bahamut.ui.components.cards

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.intellij.lang.annotations.JdkConstants


val menuItemCardModifier = Modifier
    .padding(12.dp)
    .fillMaxWidth()

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MenuItemCard(
    modifier: Modifier = Modifier,
    cardColor: Color = colors.secondary,
    textColor: Color = colors.onSecondary,
    cardIcon: ImageVector? = null,
    cardText: String,
    cardListener: () -> Unit,
){
        Card(
            modifier = menuItemCardModifier.composed { modifier },
            elevation = 8.dp,
            onClick = {cardListener()},
            backgroundColor = cardColor,
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                cardIcon?.let { icon ->
                    Icon(
                        imageVector = icon,
                        contentDescription = "icon",
                        modifier = Modifier.padding(12.dp)
                            .width(36.dp)
                            .height(36.dp),
                        tint = textColor
                    )
                }
                Text(
                    modifier = Modifier.padding(bottom = 12.dp),
                    text = cardText,
                    color = textColor,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }

        }
}