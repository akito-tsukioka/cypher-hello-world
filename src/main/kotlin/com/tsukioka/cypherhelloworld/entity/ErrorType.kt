package com.tsukioka.cypherhelloworld.entity

enum class ErrorType(
    val reason: String
) {
    NOT_FOUND("no handler found"),
    INTERNAL_SERVER_ERROR("something wrong ;-("),
    NAME_ERROR("invalid parameter")
}