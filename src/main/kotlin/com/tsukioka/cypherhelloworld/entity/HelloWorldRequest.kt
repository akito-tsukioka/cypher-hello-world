package com.tsukioka.cypherhelloworld.entity

data class HelloWorldRequest(
    val name: String,
    val text: String,
) {
    fun reply() = "Hello $text $name"
}
