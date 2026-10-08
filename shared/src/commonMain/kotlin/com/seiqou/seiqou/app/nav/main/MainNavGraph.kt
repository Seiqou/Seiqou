package com.seiqou.seiqou.app.nav.main

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.seiqou.seiqou.ui.screens.home.Home
import com.seiqou.seiqou.ui.screens.profile.Profile

fun NavGraphBuilder.mainRoutes() {
    composable<MainRoutes.Home> { Home() }

    composable<MainRoutes.Profile> { Profile() }
}