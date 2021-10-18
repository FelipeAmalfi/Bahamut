package com.ds.sample.utils

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ds.bahamut.ui.theme.BahamutTheme

abstract class BaseComponentActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BahamutTheme {
                mainContainer()
            }
        }
    }

    @Composable
    abstract fun mainContainer()


}