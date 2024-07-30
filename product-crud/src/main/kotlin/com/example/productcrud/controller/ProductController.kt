package com.example.productcrud.controller

import com.example.productcrud.model.Product
import com.example.productcrud.service.ProductService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/products")
class ProductController(private val productService: ProductService) {

    @GetMapping
    fun getAllProducts(): List<Product> = productService.getAllProducts()

    @GetMapping("/{id}")
    fun getProductById(@PathVariable id: Long): ResponseEntity<Product> {
        val product = productService.getProductById(id)
        return if (product != null) {
            ResponseEntity.ok(product)
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @PostMapping
    fun createProduct(@RequestBody product: Product): Product = productService.createProduct(product)

    @PutMapping("/{id}")
    fun updateProduct(@PathVariable id: Long, @RequestBody updatedProduct: Product): ResponseEntity<Product> {
        val product = productService.updateProduct(id, updatedProduct)
        return if (product != null) {
            ResponseEntity.ok(product)
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @DeleteMapping("/{id}")
    fun deleteProduct(@PathVariable id: Long): ResponseEntity<Void> {
        return if (productService.deleteProduct(id)) {
            ResponseEntity.ok().build()
        } else {
            ResponseEntity.notFound().build()
        }
    }
}
