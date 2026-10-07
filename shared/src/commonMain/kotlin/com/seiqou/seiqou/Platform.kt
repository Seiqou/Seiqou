package com.seiqou.seiqou

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform