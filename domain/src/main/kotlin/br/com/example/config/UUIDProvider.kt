package br.com.example.config

import java.util.*
import javax.inject.Named

@Named
class UUIDProvider {

    fun random() = UUID.randomUUID().toString()
}
