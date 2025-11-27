package assignment2.st078050.fittracker

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Alignment
@Composable
fun StatsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1F1B2E))
            .padding(24.dp)
    ) {
        Text(
            text = "Statistics",
            color = Color.White,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(20.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color(0xFF2A2438)),
            contentAlignment = Alignment.Center
        ) {
            Text("Charts coming soon...", color = Color.Gray)
        }
    }
}
