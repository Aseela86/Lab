package sa.edu.iau.cshj.lab04.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import sa.edu.iau.cshj.lab04.ui.theme.Lab04AttendanceTheme

@Composable
fun AttendanceScreen(
    uiState: AttendanceUiState,
    onCheckIn: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = uiState.sessionTitle,
            style = MaterialTheme.typography.titleLarge
        )

        Text(
            text = "Checked in: ${uiState.checkedInCount}",
            style = MaterialTheme.typography.bodyLarge
        )

        Button(
            onClick = onCheckIn,
            enabled = !uiState.isCheckedIn
        ) {
            Text(text = if (uiState.isCheckedIn) "Checked In" else "Check In")
        }
    }
}

@Composable
fun AttendanceRoute(
    modifier: Modifier = Modifier
) {
    var uiState by remember {
        mutableStateOf(AttendanceUiState(sessionTitle = "CSC 402 - Week 4", checkedInCount = 12))
    }

    AttendanceScreen(
        uiState = uiState,
        onCheckIn = {
            uiState = uiState.copy(
                checkedInCount = uiState.checkedInCount + 1,
                isCheckedIn = true
            )
        },
        modifier = modifier
    )
}

@Preview(showBackground = true, name = "Not checked in yet")
@Composable
private fun AttendanceScreenPreview() {
    Lab04AttendanceTheme {
        AttendanceScreen(
            uiState = AttendanceUiState(
                sessionTitle = "CSC 402 - Week 4",
                checkedInCount = 12,
                isCheckedIn = false
            ),
            onCheckIn = {}
        )
    }
}