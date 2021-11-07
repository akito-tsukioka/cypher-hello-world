package com.tsukioka.cypherhelloworld.entity

data class HelloWorldRequest(
    val name: String,
    val text: String,
) {
    fun isValid() = name.length in 3..10
    fun reply() = "Hello, $text $name"
}
