package com.example.helloworld

import io.ktor.application.*
import io.ktor.http.HttpStatusCode
import io.ktor.response.respond
import io.ktor.routing.get
import io.ktor.routing.routing


@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.main(testing: Boolean = false) =
    this.routing {
        this.get("/") {
            this.call.respond(HttpStatusCode.OK,"Hello, World")
        }
    }

