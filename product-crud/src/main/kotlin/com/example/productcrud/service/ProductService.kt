package com.example.productcrud.service

import com.example.productcrud.model.Product
import com.example.productcrud.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductService(private val productRepository: ProductRepository) {

    fun getAllProducts(): List<Product> = productRepository.findAll()

    fun getProductById(id: Long): Product? = productRepository.findById(id).orElse(null)

    fun createProduct(product: Product): Product = productRepository.save(product)

    fun updateProduct(id: Long, updatedProduct: Product): Product? {
        return productRepository.findById(id).map { existingProduct ->
            val newProduct = existingProduct.copy(name = updatedProduct.name, price = updatedProduct.price)
            productRepository.save(newProduct)
        }.orElse(null)
    }

    fun deleteProduct(id: Long): Boolean {
        return productRepository.findById(id).map { product ->
            productRepository.delete(product)
            true
        }.orElse(false)
    }
}
