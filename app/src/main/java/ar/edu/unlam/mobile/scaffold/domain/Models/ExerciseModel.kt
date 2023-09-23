package ar.edu.unlam.mobile.scaffold.domain.Models

import ar.edu.unlam.mobile.scaffold.domain.DTO.ExerciseDTO

data class Exercise(
    val name: String,
    val type: String,
    val muscle: String,
    val equipment: String,
    val difficulty: String,
    val instructions: String
) {
    constructor(dto: ExerciseDTO) : this(
        dto.name,
        dto.type,
        dto.muscle,
        dto.equipment,
        dto.difficulty,
        dto.instructions
    )
}