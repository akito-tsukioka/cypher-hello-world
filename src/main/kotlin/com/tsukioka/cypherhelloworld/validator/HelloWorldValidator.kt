package com.tsukioka.cypherhelloworld.validator

import com.tsukioka.cypherhelloworld.entity.HelloWorldRequest
import org.springframework.stereotype.Component
import org.springframework.validation.Errors
import org.springframework.validation.Validator
import javax.validation.ValidationException

@Component
class HelloWorldValidator : Validator {
    override fun supports(clazz: Class<*>): Boolean =
        HelloWorldRequest::class.java.isAssignableFrom(clazz)

    override fun validate(target: Any, errors: Errors) {
        if (target !is HelloWorldRequest) return

        if (!target.isValid()) throw ValidationException()
    }
}