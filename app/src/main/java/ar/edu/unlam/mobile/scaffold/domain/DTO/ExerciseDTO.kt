package ar.edu.unlam.mobile.scaffold.domain.DTO

data class ExerciseDTO(
    val name: String,
    val type: String,
    val muscle: String,
    val equipment: String,
    val difficulty: String,
    val instructions: String,
)
