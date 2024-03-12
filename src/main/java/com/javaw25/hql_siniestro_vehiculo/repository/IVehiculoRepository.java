package com.javaw25.hql_siniestro_vehiculo.repository;

import com.javaw25.hql_siniestro_vehiculo.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVehiculoRepository extends JpaRepository<Vehiculo, Long> {

}
