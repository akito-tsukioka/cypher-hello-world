package com.tsukioka.cypherhelloworld.entity

data class ErrorResponse(
    val reason: String,
) {
    fun addDetail(detail: String?): ErrorResponse =
        ErrorResponse("$reason: detail: [$detail]")
}
