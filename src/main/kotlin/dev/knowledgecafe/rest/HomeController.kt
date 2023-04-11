package dev.knowledgecafe.rest

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.*
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/")
class HomeController {



    @GetMapping
    fun getItemByName(): String =
       "This is Default page: use /item endpoint for testing"

}