package dev.knowledgecafe.rest

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.*
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/product")
class ProductController {

    val products = mutableListOf<Product>()

    @GetMapping
    fun getItemByName(@RequestParam(required = true) productName: String): ResponseEntity<Product> =
        products.stream().filter { it.name.equals(productName, true) }.findFirst()
            .map { ok(it) }.orElse(notFound().build())

    @PostMapping
    fun addItem(@RequestBody product : Product): ResponseEntity<Unit> {
        products.add(product)
        return status(HttpStatus.CREATED).build()
    }

    @DeleteMapping("/{productid}")
    fun deleteItemById(@PathVariable productid: String?): ResponseEntity<Unit> =
        if (products.removeIf{it.id == productid}) noContent().build() else notFound().build()

}