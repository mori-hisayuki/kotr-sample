package com.example.helloworld

import io.ktor.http.HttpMethod
import io.ktor.http.HttpStatusCode
import io.ktor.server.testing.handleRequest
import io.ktor.server.testing.withTestApplication
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

class ApplicationKtTest {
    @Test
    fun testRequests() = withTestApplication({ main(testing = true) }) {
        with(handleRequest(HttpMethod.Get, "/")){
            assertEquals(HttpStatusCode.OK, response.status())
            assertEquals("Hello, World", response.content)
        }
        with(handleRequest(HttpMethod.Get, "/index.html")){
            assertFalse(requestHandled)
        }
    }
}