package com.ds.bahamut.sample

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DashboardCustomize
import androidx.compose.material.icons.filled.Gamepad
import androidx.compose.material.icons.filled.Message
import androidx.compose.material.icons.filled.SmartButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.ds.bahamut.ui.components.cards.MenuItemCard



@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MenuListActivity(navController: NavHostController) {
    Column() {
        TopAppBar(
            title = { Text(text = "Bahamut") }
        )
        LazyVerticalGrid(
            cells = GridCells.Fixed(2),
            contentPadding = PaddingValues(8.dp)
        ) {
            items(getMenuItems(navController = navController)){ menuItem ->
                MenuItemCard(
                    cardText = menuItem.name,
                    cardIcon = menuItem.icon
                ) {
                    menuItem.itemClickListener()
                }
            }
        }

    }



}


private data class MenuItem(val name: String, val icon: ImageVector? = null, val itemClickListener: () -> Unit )

private fun getMenuItems(navController: NavHostController): List<MenuItem> = listOf(
        MenuItem("Dialogs", Icons.Filled.Message){navController.navigate("dialogs")},
        MenuItem("Buttons", Icons.Filled.Gamepad){navController.navigate("buttons")},
        MenuItem("Cards", Icons.Filled.DashboardCustomize){navController.navigate("buttons")},
        MenuItem("App Bars", Icons.Filled.SmartButton){navController.navigate("buttons")}
    )


