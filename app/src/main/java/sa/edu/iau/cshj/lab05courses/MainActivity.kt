package sa.edu.iau.cshj.lab05courses

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import sa.edu.iau.cshj.lab05courses.navigation.CourseApp
import sa.edu.iau.cshj.lab05courses.ui.theme.Lab05CoursesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab05CoursesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // استدعاء مكون التنقل الرئيسي الذي يربط جميع الشاشات
                    CourseApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}