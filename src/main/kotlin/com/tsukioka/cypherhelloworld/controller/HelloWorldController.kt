package com.tsukioka.cypherhelloworld.controller

import com.tsukioka.cypherhelloworld.converter.toResponse
import com.tsukioka.cypherhelloworld.entity.HelloWorldRequest
import com.tsukioka.cypherhelloworld.entity.HelloWorldResponse
import com.tsukioka.cypherhelloworld.validator.HelloWorldValidator
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.WebDataBinder
import org.springframework.web.bind.annotation.*

@RestController
class HelloWorldController(
    private val validator: HelloWorldValidator
) {
    @InitBinder("helloWorldRequest")
    fun initBinder(binder: WebDataBinder) {
        binder.addValidators(validator)
    }

    @GetMapping("/hello")
    fun getHelloWorld(
        @Validated request: HelloWorldRequest
    ): HelloWorldResponse = request.toResponse()
}