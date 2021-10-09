package com.ds.bahamut.ui.components.cards

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


val menuItemCardModifier = Modifier
    .padding(12.dp)
    .fillMaxWidth()


@Composable
fun ItemCard(
    modifier: Modifier = Modifier,
    cardColor: Color = colors.secondary,
    textColor: Color = colors.onSecondary,
    cardIcon: ImageVector? = null,
    cardText: String,
    elevation: Dp = 8.dp,
    orientation: CardOrientation = CardOrientation.Vertical,
    cardListener: () -> Unit,
) {
    when (orientation) {
        CardOrientation.Horizontal -> HorizontalItemCard(
            modifier = modifier,
            cardColor = cardColor,
            textColor = textColor,
            cardIcon = cardIcon,
            cardText = cardText,
            elevation = elevation
        ) {
            cardListener()
        }
        CardOrientation.Vertical -> VerticalItemCard(
            modifier = modifier,
            cardColor = cardColor,
            textColor = textColor,
            cardIcon = cardIcon,
            cardText = cardText,
            elevation = elevation
        ) {
            cardListener()
        }
    }

}


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun VerticalItemCard(
    modifier: Modifier,
    cardColor: Color,
    textColor: Color,
    cardIcon: ImageVector?,
    cardText: String,
    elevation: Dp,
    cardListener: () -> Unit,
) {
    Card(
        modifier = menuItemCardModifier.composed { modifier },
        elevation = elevation,
        onClick = { cardListener() },
        backgroundColor = cardColor,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            cardIcon?.let { icon ->
                Icon(
                    imageVector = icon,
                    contentDescription = "icon",
                    modifier = Modifier
                        .padding(top = 12.dp)
                        .width(36.dp)
                        .height(36.dp),
                    tint = textColor
                )
            }
            Text(
                modifier = Modifier.padding(vertical = 12.dp),
                text = cardText,
                color = textColor,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }

    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun HorizontalItemCard(
    modifier: Modifier,
    cardColor: Color,
    textColor: Color,
    cardIcon: ImageVector?,
    cardText: String,
    elevation: Dp,
    cardListener: () -> Unit,
) {
    Card(
        modifier = menuItemCardModifier.composed { modifier },
        elevation = elevation,
        onClick = { cardListener() },
        backgroundColor = cardColor,
    ) {
        Row(
            modifier = Modifier.padding(vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            cardIcon?.let { icon ->
                Icon(
                    imageVector = icon,
                    contentDescription = "icon",
                    modifier = Modifier
                        .padding(end = 8.dp)
                        .width(24.dp)
                        .height(24.dp),
                    tint = textColor
                )
            }
            Text(
                text = cardText,
                color = textColor,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }

    }
}


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CustomItemCard(
    modifier: Modifier = Modifier,
    elevation: Dp = 8.dp,
    cardColor: Color = colors.secondary,
    cardListener: () -> Unit,
    content: @Composable () -> Unit
) {
    Card(
        modifier = Modifier.padding(12.dp).composed { modifier },
        elevation = elevation,
        onClick = { cardListener() },
        backgroundColor = cardColor,
    ) {
        content()
    }
}