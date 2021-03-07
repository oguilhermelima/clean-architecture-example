package br.com.example.example.usecase

import br.com.example.config.UUIDProvider
import br.com.example.example.gateway.CreateExampleGateway
import br.com.example.example.model.Example
import javax.inject.Named

@Named
class CreateExample(
    private val createExampleGateway: CreateExampleGateway,
    private val uuidProvider: UUIDProvider
){

    fun execute (value: Int): Example {
        val example = Example(id = uuidProvider.random(), number = value)
        return createExampleGateway.create(example)
    }
}