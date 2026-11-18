package sa.edu.iau.cshj.lap10

data class TodayUiState(
    val tasks: List<StudyTask> = emptyList(),
    val isLoading: Boolean = false,
    val message: String? = null
)