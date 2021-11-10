package com.tsukioka.cypherhelloworld.converter

import com.tsukioka.cypherhelloworld.entity.HelloWorldRequest
import com.tsukioka.cypherhelloworld.entity.HelloWorldResponse

internal fun HelloWorldRequest.toResponse(): HelloWorldResponse =
    HelloWorldResponse(
        message = this.reply()
    )