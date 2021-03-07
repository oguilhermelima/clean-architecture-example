package br.com.example.example.gateway

import br.com.example.example.gateway.mongo.ExampleRepository
import br.com.example.example.model.Example
import org.springframework.stereotype.Component

@Component
class FindExampleByIdProvider(
    private val exampleRepository: ExampleRepository
) : FindExampleByIdGateway {

    override fun findExampleById(id: String): Example? {
        val valueFromService = exampleRepository.findById(id)
        return when (valueFromService.isPresent) {
            true -> valueFromService.get().toDomain()
            else -> null
        }
    }


}