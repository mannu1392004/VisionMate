package com.vortexcoders.visionmate.model

import androidx.compose.ui.graphics.vector.ImageVector

data class NavigationBarItemModel(
    val title: String,
    val selectedItem: ImageVector,
    val route: String,
    val unselectedItem: ImageVector
)
