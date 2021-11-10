package com.tsukioka.cypherhelloworld.entity

data class ErrorResponse(
    val reason: String,
) {
    companion object {
        val NOT_FOUND = ErrorResponse("no handler found")
        val INTERNAL_SERVER_ERROR = ErrorResponse("something wrong ;-(")
    }
}
