package edu.iau.cshj.csc402.lab3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun OrderPuzzleDemo() {
    Column(modifier = Modifier.padding(16.dp)) {
        // Chain A: background ثم padding
        Text(
            text = "Chain A: Background then Padding",
            modifier = Modifier
                .background(Color.Yellow)
                .padding(16.dp)
        )

        // Chain B: padding ثم background
        Text(
            text = "Chain B: Padding then Background",
            modifier = Modifier
                .padding(16.dp)
                .background(Color.Cyan)
        )

        // Chain C: clip ثم background
        Text(
            text = "Chain C: Clip then Background",
            modifier = Modifier
                .clip(RoundedCornerShape(16.dp))
                .background(Color.Magenta)
                .padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun OrderPuzzlePreview() {
    OrderPuzzleDemo()
}