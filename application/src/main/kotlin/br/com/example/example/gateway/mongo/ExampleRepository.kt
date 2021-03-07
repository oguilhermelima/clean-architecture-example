package br.com.example.example.gateway.mongo

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ExampleRepository : MongoRepository<ExampleEntity, String> {
}