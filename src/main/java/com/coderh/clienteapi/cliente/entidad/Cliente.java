package com.coderh.clienteapi.cliente.entidad;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_seq")
    @SequenceGenerator(name = "cliente_seq", sequenceName = "cliente_seq")
    @Column(name = "id", nullable = false, insertable = false, updatable = false)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;

    @Column(name = "fechanac", nullable = false)
    private LocalDate fechaNacimiento;

    public Integer getEdad() {
        return Period.between(this.getFechaNacimiento(), LocalDate.now()).getYears();
    }

    @Transient
    private Integer edad;


    public Cliente(String nombre, String apellido, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }
}