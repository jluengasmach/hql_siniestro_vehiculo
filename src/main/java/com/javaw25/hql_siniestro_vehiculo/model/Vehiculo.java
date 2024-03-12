package com.javaw25.hql_siniestro_vehiculo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import java.util.Set;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String patente;
    String marca;
    String modelo;
    @Column(name = "anio_fabricacion")
    Integer anioFabricacion;
    @Column(name = "cantidad_ruedas")
    Integer cantidadRuedas;

    @OneToMany(mappedBy = "vehiculo", cascade = CascadeType.ALL)
    Set<Siniestro> siniestros;
}
