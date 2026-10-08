package com.seiqou.seiqou

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.seiqou.seiqou.app.nav.main.MainRoutes
import com.seiqou.seiqou.app.nav.main.mainRoutes
import com.seiqou.seiqou.ui.nav.BottomNav
import com.seiqou.seiqou.ui.theme.LocalSeiqouColors
import com.seiqou.seiqou.ui.theme.SeiqouTheme

@Composable
@Preview
fun App() {
    SeiqouTheme {
        val seiqouColors = LocalSeiqouColors.current
        val navController = rememberNavController()

        Scaffold(
            modifier = Modifier.fillMaxSize(),
            bottomBar = { BottomNav() }
        ) { pv ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(seiqouColors.background)
            )

            NavHost(
                modifier = Modifier.fillMaxSize()
                    .padding(pv),
                startDestination = MainRoutes.Home,
                navController = navController
            ) {
                mainRoutes()
            }
        }
    }
}