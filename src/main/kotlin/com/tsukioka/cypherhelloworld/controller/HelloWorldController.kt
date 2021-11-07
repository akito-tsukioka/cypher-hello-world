package com.tsukioka.cypherhelloworld.controller

import com.tsukioka.cypherhelloworld.converter.toResponse
import com.tsukioka.cypherhelloworld.entity.HelloWorldRequest
import com.tsukioka.cypherhelloworld.entity.HelloWorldResponse
import com.tsukioka.cypherhelloworld.validator.HelloWorldValidator
import org.springframework.beans.factory.annotation.Value
import org.springframework.validation.BeanPropertyBindingResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController(
    private val validator: HelloWorldValidator
) {
    @GetMapping("/hello")
    fun getHelloWorld(
        @RequestParam("name", required = false) name: String,
        @Value(value = "\${text.value}") text: String,
    ): HelloWorldResponse {
        val request = HelloWorldRequest(name = name, text = text)
        validator.validate(request, BeanPropertyBindingResult(request, "helloWorldRequest"))

        return request.toResponse()
    }
}