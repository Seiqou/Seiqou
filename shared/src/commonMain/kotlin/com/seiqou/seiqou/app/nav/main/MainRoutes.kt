package com.seiqou.seiqou.app.nav.main

import kotlinx.serialization.Serializable

@Serializable
sealed class MainRoutes {

    @Serializable
    data object Home : MainRoutes()

    @Serializable
    data object Profile : MainRoutes()
}