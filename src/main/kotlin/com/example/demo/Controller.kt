package com.example.demo

import io.github.resilience4j.micronaut.annotation.RateLimiter
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get


@Controller("/")
class Controller() {
    @Get("/v1/dummyRequest")
    fun dummyRequestV1(): HttpResponse<String> {
        return HttpResponse.ok("hello")
    }
}