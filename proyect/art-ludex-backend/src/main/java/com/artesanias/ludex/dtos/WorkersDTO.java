package com.artesanias.ludex.dtos;

import com.artesanias.ludex.model.UserType;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class WorkersDTO {
    private Long id;

    @NotNull
    @Size(min = 5, max = 50, message = "{user_name.size}")
    private String name;

    @NotNull
    private String apellido;

    @NotNull
    @Email
    private int DNI;

    @NotNull
    @Size(min = 11, max = 20)
    private int NumeroTelefono;

    @NotNull
    @Size(min = 8, max = 8)
    private Date FechaNacimiento;


}
