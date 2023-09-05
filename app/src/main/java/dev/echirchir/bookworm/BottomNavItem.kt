package dev.echirchir.bookworm

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(var title: String, var icon: ImageVector, var screen_route: String){
    object Home : BottomNavItem("Home", Icons.Default.Home,"home")
    object Library : BottomNavItem("Library", Icons.Default.List,"library")
    object Discover : BottomNavItem("Discover", Icons.Default.Search,"discover")
    object Settings: BottomNavItem("Settings", Icons.Default.Settings,"settings")
}