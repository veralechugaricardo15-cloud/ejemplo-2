package com.example.albahaca

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform