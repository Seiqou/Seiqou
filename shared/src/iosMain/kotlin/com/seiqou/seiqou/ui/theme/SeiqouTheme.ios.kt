package com.seiqou.seiqou.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import platform.UIKit.UIApplication
import platform.UIKit.UIStatusBarStyleLightContent
import platform.UIKit.setStatusBarStyle

@Composable
actual fun SystemBarColorEffect() {
    SideEffect {
        UIApplication.sharedApplication.setStatusBarStyle(
            UIStatusBarStyleLightContent,
            animated = true
        )
    }
}