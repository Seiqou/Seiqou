package com.seiqou.seiqou.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
data class SeiqouColors(
    val background: Color,
    val button: Color,
    val onButton: Color
)

fun seiqouColors(isDarkTheme: Boolean) = SeiqouColors(
    background = if (isDarkTheme)
        Color(240, 229, 255, 255)
    else Color(240, 229, 255, 255),
    button = if (isDarkTheme)
        Color(239, 190, 255)
    else Color(239, 190, 255),
    onButton = if (isDarkTheme)
        Color(23, 8, 31, 255)
    else Color(23, 8, 31, 255),
)