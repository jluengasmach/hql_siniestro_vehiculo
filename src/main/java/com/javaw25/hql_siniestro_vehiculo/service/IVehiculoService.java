package com.javaw25.hql_siniestro_vehiculo.service;

import com.javaw25.hql_siniestro_vehiculo.dto.PatenteDto;
import com.javaw25.hql_siniestro_vehiculo.dto.PatenteMarcaModeloDto;
import com.javaw25.hql_siniestro_vehiculo.dto.PatenteMarcaModeloPerdidaDto;
import com.javaw25.hql_siniestro_vehiculo.dto.PatenteYMarcaDto;
import com.javaw25.hql_siniestro_vehiculo.dto.VehiculoDto;
import java.util.List;

public interface IVehiculoService {
    void createVehicle(VehiculoDto vehiculoDto);
    List<PatenteDto> getPatentes();
    List<PatenteYMarcaDto> getPatenteYMarcaOrdenados(String orden);
    List<PatenteDto> getPatentesMasCuatroRuedas();
    List<PatenteMarcaModeloDto> getPatenteMarcaModeloSiniestro();
    List<PatenteMarcaModeloPerdidaDto> getPatenteMarcaModeloPerdidaSiniestro();
}
