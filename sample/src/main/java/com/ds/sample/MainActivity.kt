package com.ds.sample

import android.os.Bundle
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ds.bahamut.ui.theme.*
import com.ds.sample.button.ButtonsActivity
import com.ds.sample.card.CardsActivity
import com.ds.sample.dialog.DialogActivity
import com.ds.sample.menu.MenuListActivity
import com.ds.sample.utils.BaseComponentActivity


class MainActivity : BaseComponentActivity() {

    @Composable
    override fun mainContainer() {
        mainNavHost()
    }

    @Composable
    fun mainNavHost(){
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = "menu") {
            composable("menu") { MenuListActivity(navController) }
            composable("dialogs") { DialogActivity() }
            composable("buttons") { ButtonsActivity() }
            composable("cards") { CardsActivity() }
        }

    }


}









