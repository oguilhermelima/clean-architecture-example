package br.com.example.example.gateway.mongo

import br.com.example.example.model.Example
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


@Document("examples")
data class ExampleEntity (

    @Id
    val id: String,
    val number: Int
) {

    companion object {
        fun fromDomain(id: String, number: Int): ExampleEntity {
            return ExampleEntity(
                id = id,
                number = number
            )
        }
    }

    fun toDomain(): Example {
        return Example(
            id = id,
            number = number
        )
    }

}