package com.tsukioka.cypherhelloworld.advice

import com.tsukioka.cypherhelloworld.entity.ErrorResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.servlet.NoHandlerFoundException
import javax.validation.ConstraintViolationException

@RestControllerAdvice
class HelloWorldExceptionHandler {
    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    fun handler(ex: NoHandlerFoundException): ErrorResponse =
        ErrorResponse.NOT_FOUND

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    fun handler(ex: ConstraintViolationException): ErrorResponse =
        ErrorResponse("invalid parameter: detail: [${ex.message}]")

    @ExceptionHandler
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    fun handler(ex: Exception): ErrorResponse =
        ErrorResponse.INTERNAL_SERVER_ERROR
}