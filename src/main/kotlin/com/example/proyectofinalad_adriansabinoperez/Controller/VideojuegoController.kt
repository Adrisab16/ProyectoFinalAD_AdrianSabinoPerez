package com.example.proyectofinalad_adriansabinoperez

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/videojuegos")
class VideojuegoController(private val videojuegoService: VideojuegoService)
