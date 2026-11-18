package sa.edu.iau.cshj.lab05courses.navigation

import kotlinx.serialization.Serializable

@Serializable
object Home

@Serializable
object CourseList

@Serializable
data class CourseDetail(val code: String)