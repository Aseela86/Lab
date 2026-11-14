package edu.iau.cshj.csc402.lab2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.iau.cshj.csc402.lab2.ui.theme.AndroidGreen
import edu.iau.cshj.csc402.lab2.ui.theme.Navy
import edu.iau.cshj.csc402.lab2.ui.theme.ScreenBackground

@Composable
fun WelcomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(ScreenBackground)
    ) {
        // Top Bar
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Navy)
                .padding(16.dp)
        ) {
            Column {
                Text(text = "CSC 402 Lab 2", color = Color.White, fontWeight = FontWeight.Bold)
                Text(text = "Task 6 - My First Screen", color = Color.LightGray, fontSize = 12.sp)
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Main Card Content
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Circular Avatar with "JU"
                Box(
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape)
                        .background(Navy),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "JU", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 20.sp)
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(text = "Hello, Jubail!", fontSize = 26.sp, fontWeight = FontWeight.Bold, color = Navy)

                Spacer(modifier = Modifier.height(8.dp))

                Text(text = "Welcome to Mobile Application Programming.", color = Color.Gray)
                Text(text = "Everything on this screen is built with Jetpack Compose function.", color = Color.Gray, fontSize = 12.sp)

                Spacer(modifier = Modifier.height(16.dp))

                // Green Chip
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(50.dp))
                        .background(AndroidGreen.copy(alpha = 0.2f))
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                ) {
                    Text(text = "Built with Jetpack Compose", color = AndroidGreen, fontWeight = FontWeight.Bold, fontSize = 12.sp)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen()
}