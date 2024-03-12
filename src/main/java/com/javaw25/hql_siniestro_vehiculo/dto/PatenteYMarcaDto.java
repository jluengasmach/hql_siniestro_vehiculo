package com.javaw25.hql_siniestro_vehiculo.dto;

import java.time.LocalDate;

public record PatenteYMarcaDto (
        String patente,
        String marca,
        Integer anioFabricacion
){}
