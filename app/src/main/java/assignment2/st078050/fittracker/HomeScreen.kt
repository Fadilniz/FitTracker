package assignment2.st078050.fittracker

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(onNavigate: (String) -> Unit) {

    Scaffold(
        bottomBar = {
            BottomNavBar(
                selectedScreen = "home",
                onNavigate = onNavigate
            )
        }
    ) { paddingValues ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF1F1B2E))
                .padding(paddingValues)
                .padding(24.dp)
        ) {

            Text(
                text = "Hi, Youssef",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(text = "Your Schedule", color = Color.Gray)

            Spacer(modifier = Modifier.height(20.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF2A2438)
                )
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text("Your weekly activity will show here", color = Color.Gray)
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFF7E86A)
                ),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Start Workout", color = Color.Black, fontWeight = FontWeight.Bold)
            }
        }
    }
}
