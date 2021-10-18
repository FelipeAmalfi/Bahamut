package com.ds.sample

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
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









