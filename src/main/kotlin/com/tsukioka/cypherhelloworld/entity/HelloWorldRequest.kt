package com.tsukioka.cypherhelloworld.entity

data class HelloWorldRequest(
    val name: String,
) {
    fun isValid() = name.length in 3..10
}
