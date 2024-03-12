package com.javaw25.hql_siniestro_vehiculo.service;

import com.javaw25.hql_siniestro_vehiculo.dto.SiniestroDto;
import com.javaw25.hql_siniestro_vehiculo.model.Siniestro;
import com.javaw25.hql_siniestro_vehiculo.repository.ISiniestroRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class SiniestroImp implements ISiniestroService{
    ISiniestroRepository siniestroRepo;
    private final ModelMapper mapper = new ModelMapper();

    public SiniestroImp(ISiniestroRepository siniestroRepo) {
        this.siniestroRepo = siniestroRepo;
    }
    @Override
    public void createSiniestro(SiniestroDto siniestroDto){
        System.out.println("--------Pase por aca---------");
        System.out.println(siniestroDto);
        Siniestro siniestro = mapper.map(siniestroDto, Siniestro.class);
        siniestroRepo.save(siniestro);
    }
}
