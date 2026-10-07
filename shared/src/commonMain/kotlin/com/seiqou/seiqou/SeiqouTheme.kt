package com.seiqou.seiqou

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

@Composable
expect fun SystemBarColorEffect()

@Composable
fun SeiqouTheme(content: @Composable () -> Unit) {
    SystemBarColorEffect()

    MaterialTheme(
        colorScheme = lightColorScheme(),
        typography = Typography(),
        content = content
    )
}