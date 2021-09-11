package com.ds.bahamut

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ds.bahamut.ui.components.dialogs.ConfirmInputDialog
import com.ds.bahamut.ui.theme.BahamutTheme
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.ui.graphics.RectangleShape
import com.ds.bahamut.ui.components.buttons.FixedButton


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BahamutTheme {
                // A surface container using the 'background' color from the theme
                openDialog()
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = name)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BahamutTheme {
        openDialog()
    }

}


@Composable
fun openDialog() {
    val (isConfirmDialogOpen, setConfirmDialogState) = remember { mutableStateOf(false) }

    FixedButton(
        buttonText = "Open Dialog",
        buttonShape = RoundedCornerShape(8.dp),
        buttonListener = { setConfirmDialogState(true) }
    )

    if (isConfirmDialogOpen) {
        ConfirmInputDialog(
            title = "Dialog test",
            close = { setConfirmDialogState(false) },
            confirm = { setConfirmDialogState(false) },
        )
    }

}