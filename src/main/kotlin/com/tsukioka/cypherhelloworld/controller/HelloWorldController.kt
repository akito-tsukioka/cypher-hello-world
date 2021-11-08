package com.tsukioka.cypherhelloworld.controller

import com.tsukioka.cypherhelloworld.entity.HelloWorldResponse
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import javax.validation.constraints.Size

@Validated
@RestController
class HelloWorldController {
    @GetMapping("/hello")
    fun getHelloWorld(
        @Size(min = 3, max = 10) @RequestParam("name") name: String
    ): HelloWorldResponse = HelloWorldResponse("Hello, $name")
}