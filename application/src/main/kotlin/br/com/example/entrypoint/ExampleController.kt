package br.com.example.entrypoint

import br.com.example.example.model.Example
import br.com.example.example.usecase.CreateExample
import br.com.example.example.usecase.FindExampleById
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = ["/api/v1/example"], produces = [MediaType.APPLICATION_JSON_VALUE])
class ExampleController(
    private val createExample: CreateExample,
    private val findExampleById: FindExampleById
) {

    @PostMapping
    fun createExample(@RequestParam value: Int): ResponseEntity<Example> {
        val example = createExample.execute(value)
        return ResponseEntity(example, HttpStatus.CREATED)
    }

    @GetMapping(value = ["/{exampleId}"])
    fun findExampleNumber(@PathVariable exampleId: String): Example? {
        return findExampleById.execute(exampleId)
    }
}