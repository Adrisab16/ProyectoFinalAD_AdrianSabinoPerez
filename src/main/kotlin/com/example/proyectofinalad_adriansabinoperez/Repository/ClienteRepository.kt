package com.example.proyectofinalad_adriansabinoperez

import org.springframework.data.jpa.repository.JpaRepository

interface ClienteRepository : JpaRepository<Cliente, String>