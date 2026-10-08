package com.seiqou.seiqou.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf

val LocalSeiqouColors = staticCompositionLocalOf { seiqouColors(isDarkTheme = false) }

@Composable
fun SeiqouTheme(
    isDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    SystemBarColorEffect()

    CompositionLocalProvider(
        LocalSeiqouColors provides seiqouColors(isDarkTheme)
    ) {
        MaterialTheme(
            colorScheme = lightColorScheme(),
            typography = Typography(),
            content = content
        )
    }
}

@Composable
expect fun SystemBarColorEffect()