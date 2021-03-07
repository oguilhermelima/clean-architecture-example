package br.com.example.example.gateway

import br.com.example.example.gateway.mongo.ExampleEntity
import br.com.example.example.gateway.mongo.ExampleRepository
import br.com.example.example.model.Example
import org.springframework.stereotype.Component

@Component
class CreateExampleProvider(
    private val exampleRepository: ExampleRepository
) : CreateExampleGateway {

    override fun create(example: Example): Example {
        val exampleEntity = ExampleEntity.fromDomain(example.id, example.number)
        val result = exampleRepository.insert(exampleEntity)
        return result.toDomain()
    }


}