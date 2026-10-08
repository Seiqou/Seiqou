package com.seiqou.seiqou

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    SeiqouTheme {
        val seiqouColors = LocalSeiqouColors.current

        Scaffold(modifier = Modifier.fillMaxSize()) { pv ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(pv)
                    .background(seiqouColors.success)
            )
        }
    }
}