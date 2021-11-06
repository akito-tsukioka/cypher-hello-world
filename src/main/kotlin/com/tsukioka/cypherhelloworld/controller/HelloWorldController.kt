package com.tsukioka.cypherhelloworld.controller

import com.tsukioka.cypherhelloworld.entity.HelloWorldResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {
    @GetMapping("/hello")
    fun getHelloWorld(
        @RequestParam("name") name: String
    ): HelloWorldResponse = HelloWorldResponse("Hello, $name")
}