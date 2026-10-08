package com.seiqou.seiqou

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
data class SeiqouColors(
    val success: Color,
    val warning: Color,
    val subtleBorder: Color,
)

fun seiqouColors(isDarkTheme: Boolean) = SeiqouColors(
    success = if (isDarkTheme) Color(0xFF360303) else Color(0xFF2E7D32),
    warning = Color(0xFFF9A825),
    subtleBorder = Color(0xFFE0E0E0),
)