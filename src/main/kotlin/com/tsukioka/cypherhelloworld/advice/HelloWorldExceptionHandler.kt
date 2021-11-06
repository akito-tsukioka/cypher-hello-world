package com.tsukioka.cypherhelloworld.advice

import com.tsukioka.cypherhelloworld.entity.ErrorResponse
import com.tsukioka.cypherhelloworld.entity.ErrorType
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.servlet.NoHandlerFoundException

@RestControllerAdvice
class HelloWorldExceptionHandler {
    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    fun handler(ex: NoHandlerFoundException): ErrorResponse = ErrorResponse(ErrorType.NOT_FOUND.reason)

    @ExceptionHandler
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    fun handler(ex: Exception): ErrorResponse = ErrorResponse(ErrorType.INTERNAL_SERVER_ERROR.reason)
}