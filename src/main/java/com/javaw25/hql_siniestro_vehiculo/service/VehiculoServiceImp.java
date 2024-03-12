package com.javaw25.hql_siniestro_vehiculo.service;

import com.javaw25.hql_siniestro_vehiculo.dto.PatenteDto;
import com.javaw25.hql_siniestro_vehiculo.dto.PatenteMarcaModeloDto;
import com.javaw25.hql_siniestro_vehiculo.dto.PatenteMarcaModeloPerdidaDto;
import com.javaw25.hql_siniestro_vehiculo.dto.PatenteYMarcaDto;
import com.javaw25.hql_siniestro_vehiculo.dto.VehiculoDto;
import com.javaw25.hql_siniestro_vehiculo.model.Vehiculo;
import com.javaw25.hql_siniestro_vehiculo.repository.IVehiculoRepository;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class VehiculoServiceImp implements IVehiculoService{
    IVehiculoRepository vehiculoRepo;
    private final ModelMapper mapper = new ModelMapper();

    public VehiculoServiceImp(IVehiculoRepository vehiculoRepo) {
        this.vehiculoRepo = vehiculoRepo;
    }

    @Override
    public void createVehicle(VehiculoDto vehiculoDto){
        System.out.println("--------Pase por aca---------");
        System.out.println(vehiculoDto);
        Vehiculo vehiculo = mapper.map(vehiculoDto, Vehiculo.class);
        System.out.println(vehiculo);
        vehiculoRepo.save(vehiculo);
    }

    @Override
    public List<PatenteDto> getPatentes() {
        return null;
    }

    @Override
    public List<PatenteYMarcaDto> getPatenteYMarcaOrdenados(String orden) {
        return null;
    }

    @Override
    public List<PatenteDto> getPatentesMasCuatroRuedas() {
        return null;
    }

    @Override
    public List<PatenteMarcaModeloDto> getPatenteMarcaModeloSiniestro() {
        return null;
    }

    @Override
    public List<PatenteMarcaModeloPerdidaDto> getPatenteMarcaModeloPerdidaSiniestro() {
        return null;
    }
}
