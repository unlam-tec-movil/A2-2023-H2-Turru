package ar.edu.unlam.mobile.scaffold.domain.Models

sealed class Screens(val route: String) {
    object Home : Screens("home")
    object Secondary : Screens("secondary")
    object SearchExercise : Screens("searchExercise")
    object ExerciseDetails : Screens("exerciseDetails")
}
