package com.ds.sample.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import coil.compose.rememberImagePainter
import com.ds.bahamut.ui.components.cards.CardOrientation
import com.ds.bahamut.ui.components.cards.CustomItemCard
import com.ds.bahamut.ui.components.cards.ItemCard

const val imageUrl =
    "https://lh3.googleusercontent.com/proxy/NkWK6jpC_Ls_0VByYBjAr4Q0Z62PtsGjWbkcnV7cdOE3R31yJgZuJGUZeAtr1Wy9KEievNMUMW-zm1G5mFJk6xlFqEEk8HN91mwOGyl4z6xk4GW3UgFF3-_gbWU"

@Composable
fun CardsActivity() {
    Column {
        TopAppBar(
            title = { Text(text = "Buttons") }
        )
        ItemCard(
            cardText = "Card name",
            cardIcon = Icons.Filled.Info
        ) {

        }

        ItemCard(
            cardText = "Card name",
            cardIcon = Icons.Filled.Info,
            orientation = CardOrientation.Horizontal
        ) {
        }

        ItemCard(
            cardText = "Card name",
        ) {
        }

        CustomItemCard(cardListener = { /*TODO*/ }) {
            CardContent()
        }


    }

}


@Composable
fun CardContent() {
    Image(painter = rememberImagePainter(data = imageUrl), contentDescription = "damnation")
    Column(
    ) {
        Text(text = "2{B}{B}")
        Text(text = "Damnation")
        Text(text = "Destroy all Creatures")
    }
}