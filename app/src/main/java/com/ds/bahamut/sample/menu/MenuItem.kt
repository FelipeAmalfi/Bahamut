package com.ds.bahamut.sample.menu

import androidx.compose.ui.graphics.vector.ImageVector

data class MenuItem(
    val name: String,
    val icon: ImageVector? = null,
    val itemClickListener: () -> Unit
)
