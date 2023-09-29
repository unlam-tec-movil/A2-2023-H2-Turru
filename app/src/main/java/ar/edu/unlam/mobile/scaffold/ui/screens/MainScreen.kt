package ar.edu.unlam.mobile.scaffold.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import ar.edu.unlam.mobile.scaffold.domain.Models.Screens
import ar.edu.unlam.mobile.scaffold.ui.components.BottomBar
import ar.edu.unlam.mobile.scaffold.ui.components.NavigationComponent
import ar.edu.unlam.mobile.scaffold.ui.screens.Home.HomeScreen

@Composable
fun MainScreen() {
    // Controller es el elemento que nos permite navegar entre pantallas. Tiene las acciones
    // para navegar como navigate y también la información de en dónde se "encuentra" el usuario
    // a través del back stack
    val controller = rememberNavController()
    Scaffold(
        bottomBar = { BottomBar(controller = controller) },
    ) { paddingValue ->
        NavigationComponent(
            navigationCotroller = controller,
            modifier = Modifier.padding(paddingValue)
        )
    }
}