package com.ds.sample.button

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable


@Composable
fun ButtonsActivity() {
    Column {
        TopAppBar(
            title = { Text(text = "Buttons") }
        )
    }
}
