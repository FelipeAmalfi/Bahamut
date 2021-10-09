package com.ds.bahamut.sample.button

import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import com.ds.bahamut.sample.utils.BaseComponentActivity


@Composable
fun ButtonsActivity() {
    Column {
        TopAppBar(
            title = { Text(text = "Buttons") }
        )
    }
}
