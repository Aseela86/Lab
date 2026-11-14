package edu.iau.cshj.csc402.lab2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.iau.cshj.csc402.lab2.ui.theme.Navy
import edu.iau.cshj.csc402.lab2.ui.theme.ScreenBackground

// نموذج بيانات المقرر
data class CourseItem(val code: String, val title: String, val credits: Int, val days: String)

@Composable
fun CourseListScreen(modifier: Modifier = Modifier) {
    val courses = listOf(
        CourseItem("CSC 402", "Mobile Application Programming", 3, "Mon/Wed"),
        CourseItem("CSC 311", "Database Systems", 4, "Sun/Tue"),
        CourseItem("CSC 348", "Operating Systems", 3, "Mon/Wed"),
        CourseItem("MATH 282", "Discrete Mathematics", 3, "Sun/Thu"),
        CourseItem("ENG 214", "Technical Writing", 2, "Tue")
    )

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(ScreenBackground)
            .padding(16.dp)
    ) {
        Text(
            text = "Enrolled Courses",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = Navy,
            modifier = Modifier.padding(bottom = 12.dp)
        )

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(courses) { course ->
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(
                                text = course.code,
                                fontWeight = FontWeight.Bold,
                                color = Navy,
                                fontSize = 16.sp
                            )
                            Text(
                                text = "${course.credits} Credits",
                                color = Color.Gray,
                                fontSize = 14.sp
                            )
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = course.title,
                            fontSize = 14.sp,
                            color = Color.DarkGray
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "Days: ${course.days}",
                            fontSize = 12.sp,
                            color = Color.Gray
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CourseListScreenPreview() {
    CourseListScreen()
}