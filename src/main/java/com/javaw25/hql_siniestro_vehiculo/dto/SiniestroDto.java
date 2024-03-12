package com.javaw25.hql_siniestro_vehiculo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;

public record SiniestroDto (
        Long id,
        @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
        LocalDate fecha,
        Double perdidaEconomica
){}
