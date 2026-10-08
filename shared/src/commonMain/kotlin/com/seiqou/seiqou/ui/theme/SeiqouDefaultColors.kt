package com.seiqou.seiqou.ui.theme

import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable

@Composable
fun getSeiqouButtonColors(seiqouColors: SeiqouColors) = ButtonDefaults.buttonColors().copy(
    containerColor = seiqouColors.button,
    contentColor = seiqouColors.onButton
)