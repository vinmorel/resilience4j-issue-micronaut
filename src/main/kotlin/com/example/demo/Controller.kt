package com.example.demo

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller


@Controller("/")
open class Controller() {
    fun dummyRequestV1(): HttpResponse<String> {
        return HttpResponse.ok("hello")
    }
}