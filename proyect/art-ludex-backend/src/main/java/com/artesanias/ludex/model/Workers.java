
package com.artesanias.ludex.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Workers")
public class Workers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @Column(name = "apellido", nullable = false, length = 40)
    private String apellido;

    @Column(name = "DNI", nullable = false, length = 12)
    private String DNI;
    @Column(name = "NumeroTelefono", nullable = false, length = 40)
    private String NumeroTelefono;
    @Column(name = "FechaNacimiento", nullable = false, length = 12)
    private String FechaNacimiento;

}
