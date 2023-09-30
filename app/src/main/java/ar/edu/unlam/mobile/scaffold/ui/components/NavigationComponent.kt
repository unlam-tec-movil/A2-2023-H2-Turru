package ar.edu.unlam.mobile.scaffold.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import ar.edu.unlam.mobile.scaffold.domain.Models.Screens
import ar.edu.unlam.mobile.scaffold.ui.screens.ExerciseSearch.ExerciseSearchScreen
import ar.edu.unlam.mobile.scaffold.ui.screens.Home.HomeScreen
import ar.edu.unlam.mobile.scaffold.ui.screens.SecondaryScreen

@Composable
fun NavigationComponent(
    navigationCotroller: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navigationCotroller,
        startDestination = Screens.Home.route,
        modifier = modifier,
    ) {
        composable(Screens.Home.route) {
            HomeScreen(modifier = modifier)
        }
        composable(
            route = "${Screens.Secondary.route}/{id}",
            arguments = listOf(navArgument("id") { type = NavType.IntType }),
        ) { navBackStackEntry ->
            val id = navBackStackEntry.arguments?.getInt("id") ?: 1
            SecondaryScreen(controller = navigationCotroller, id = id)
        }
        composable(
            route = Screens.SearchExercise.route,
        ) {
            ExerciseSearchScreen()
        }
    }
}
