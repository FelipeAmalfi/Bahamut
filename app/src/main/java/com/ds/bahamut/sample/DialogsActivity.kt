package com.ds.bahamut.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ds.bahamut.ui.components.buttons.FixedButton
import com.ds.bahamut.ui.components.dialogs.ConfirmInputDialog
import com.ds.bahamut.ui.theme.BahamutTheme


@Composable
fun DialogActivity() {
    val (isConfirmDialogOpen, setConfirmDialogState) = remember { mutableStateOf(false) }
    Column(){
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

}
