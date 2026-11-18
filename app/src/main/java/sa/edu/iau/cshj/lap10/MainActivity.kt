package sa.edu.iau.cshj.lap10

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import sa.edu.iau.cshj.lap10.ui.theme.Lap10Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lap10Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    Modifier.padding(innerPadding)
                    TodayRoute()
                }
            }
        }
    }
}