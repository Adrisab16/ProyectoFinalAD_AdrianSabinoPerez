package com.example.proyectofinalad_adriansabinoperez

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/clientes")
class ClienteController(private val clienteService: ClienteService)
