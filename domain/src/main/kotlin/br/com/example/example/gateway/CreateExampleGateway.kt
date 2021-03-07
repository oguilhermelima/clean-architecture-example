package br.com.example.example.gateway

import br.com.example.example.model.Example

interface CreateExampleGateway {

    fun create(example: Example): Example
}