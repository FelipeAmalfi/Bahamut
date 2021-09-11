package com.ds.bahamut.ui.components.dialogs

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.ds.bahamut.R
import com.ds.bahamut.ui.components.buttons.FixedButton
import com.ds.bahamut.ui.components.textfields.ClearTextField
import com.ds.bahamut.ui.theme.Gray50
import com.ds.bahamut.ui.theme.Success

@Composable
fun ConfirmInputDialog(
    title: String,
    keyboardOptions: KeyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
    close: () -> Unit,
    confirm: (String) -> Unit
) {
    val (input, setInput) = remember { mutableStateOf("") }
    Dialog(onDismissRequest = { close() }) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .background(color = colors.surface, shape = RoundedCornerShape(4.dp))
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                modifier = Modifier.padding(16.dp),
                text = title,
                color = colors.onSurface,
                style = typography.h6
            )

            ClearTextField(
                modifier = Modifier
                    .absolutePadding(top = 8.dp, bottom = 24.dp, right = 16.dp, left = 16.dp),
                value = input,
                onValueChange = setInput,
                shape = RoundedCornerShape(4.dp),
                singleLine = true,
                keyboardOptions = keyboardOptions,
                label = "Input"
            )

            FixedButton(
                buttonText = stringResource(R.string.dialog_confirm_button),
                buttonShape = RoundedCornerShape(bottomStart = 4.dp, bottomEnd = 4.dp),
                buttonColor = Success,
                textColor = Gray50
            ) {
                confirm(input)
                close()
            }
        }
    }
}