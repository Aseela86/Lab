package edu.iau.cshj.csc402.lab2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.iau.cshj.csc402.lab2.ui.theme.AndroidGreen
import edu.iau.cshj.csc402.lab2.ui.theme.Navy
import edu.iau.cshj.csc402.lab2.ui.theme.ScreenBackground

@Composable
fun AttendanceCounterScreen(modifier: Modifier = Modifier) {
    // حالة تخزين عدد الحضور
    var attendanceCount by remember { mutableStateOf(0) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(ScreenBackground)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Class Attendance Tracker",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Navy
                )

                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    text = "$attendanceCount",
                    fontSize = 48.sp,
                    fontWeight = FontWeight.Bold,
                    color = AndroidGreen
                )

                Text(
                    text = "Students Present",
                    fontSize = 14.sp,
                    color = Color.Gray
                )

                Spacer(modifier = Modifier.height(24.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Button(
                        onClick = { if (attendanceCount > 0) attendanceCount-- },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Red.copy(alpha = 0.7f))
                    ) {
                        Text(text = "Decrease")
                    }

                    Button(
                        onClick = { attendanceCount++ },
                        colors = ButtonDefaults.buttonColors(containerColor = Navy)
                    ) {
                        Text(text = "Increase")
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AttendanceCounterScreenPreview() {
    AttendanceCounterScreen()
}