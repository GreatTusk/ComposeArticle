package com.f776.composearticle

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform