package com.javaw25.hql_siniestro_vehiculo.controller;

import com.javaw25.hql_siniestro_vehiculo.dto.SiniestroDto;
import com.javaw25.hql_siniestro_vehiculo.dto.VehiculoDto;
import com.javaw25.hql_siniestro_vehiculo.repository.ISiniestroRepository;
import com.javaw25.hql_siniestro_vehiculo.service.ISiniestroService;
import com.javaw25.hql_siniestro_vehiculo.service.IVehiculoService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ReporteController {
    ISiniestroService siniestroService;
    IVehiculoService vehiculoService;

    public ReporteController(ISiniestroService siniestroService, IVehiculoService vehiculoService) {
        this.siniestroService = siniestroService;
        this.vehiculoService = vehiculoService;
    }

    @PostMapping("/vehiculo")
    public ResponseEntity<?> crearVehiculo(@RequestBody VehiculoDto vehiculoDto){
        vehiculoService.createVehicle(vehiculoDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/siniestro")
    public ResponseEntity<?> crearSiniestro(@RequestBody SiniestroDto siniestroDto){
        siniestroService.createSiniestro(siniestroDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/patentes")
    public ResponseEntity<?> listarPatentes(@RequestParam(defaultValue = "desc", required = false) String anio) { // asc, desc
        return null;
    }

    @GetMapping("/patentes/ruedas")
    public ResponseEntity<?> listarPatentePorRuedasYAnio(@RequestParam(defaultValue = "4") Integer ruedas, @RequestParam(defaultValue = "2024") Integer anio){
        return null;
    }
    @GetMapping("/patentes/monto")
    public ResponseEntity<?> listarVehiculosPorMontoDeSiniestro(@RequestParam(defaultValue = "10000", name="min_valor_perdida") Double minValorPerdida) {
        return null;
    }
}
