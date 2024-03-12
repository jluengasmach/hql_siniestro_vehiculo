package com.javaw25.hql_siniestro_vehiculo.dto;

import com.javaw25.hql_siniestro_vehiculo.model.Siniestro;
import java.util.Set;

public record VehiculoDto (
    Long id,
    String patente,
    String marca,
    String modelo,
    Integer anioFabricacion,
    Integer cantidadRuedas,
    Set<SiniestroDto> siniestros
) {}
