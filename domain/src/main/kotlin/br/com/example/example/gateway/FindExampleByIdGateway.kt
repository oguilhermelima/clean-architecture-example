package br.com.example.example.gateway

import br.com.example.example.model.Example

interface FindExampleByIdGateway {

    fun findExampleById(id: String): Example?
}