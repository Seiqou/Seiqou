package com.seiqou.seiqou.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
data class SeiqouColors(
    val background: Color,
    val button: Color,
    val onButton: Color
)

private val lightColors = SeiqouColors(
    background = Color(240, 229, 255, 255),
    button = Color(239, 190, 255),
    onButton = Color(23, 8, 31, 255),
)

private val darkColors = SeiqouColors(
    background = Color(240, 229, 255, 255),
    button = Color(239, 190, 255),
    onButton = Color(23, 8, 31, 255),
)

fun seiqouColors(isDarkTheme: Boolean) =
    if (isDarkTheme) {
        darkColors
    } else {
        lightColors
    }