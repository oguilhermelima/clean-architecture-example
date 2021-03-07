package br.com.example.example.usecase

import br.com.example.example.gateway.FindExampleByIdGateway
import br.com.example.example.model.Example
import javax.inject.Named

@Named
class FindExampleById(
    private val findExampleByIdGateway: FindExampleByIdGateway
){

    fun execute(id: String): Example? {
        return findExampleByIdGateway.findExampleById(id)
    }
}