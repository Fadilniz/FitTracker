package assignment2.st078050.fittracker

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.BarChart
import androidx.compose.material.icons.filled.Settings

@Composable
fun BottomNavBar(
    selectedScreen: String,
    onNavigate: (String) -> Unit
) {
    NavigationBar(containerColor = Color(0xFF2A2438)) {

        NavigationBarItem(
            selected = selectedScreen == "home",
            onClick = { onNavigate("home") },
            icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
            label = { Text("Home") }
        )

        NavigationBarItem(
            selected = selectedScreen == "stats",
            onClick = { onNavigate("stats") },
            icon = { Icon(Icons.Default.BarChart, contentDescription = "Stats") },
            label = { Text("Stats") }
        )

        NavigationBarItem(
            selected = selectedScreen == "settings",
            onClick = { onNavigate("settings") },
            icon = { Icon(Icons.Default.Settings, contentDescription = "Settings") },
            label = { Text("Settings") }
        )
    }
}
