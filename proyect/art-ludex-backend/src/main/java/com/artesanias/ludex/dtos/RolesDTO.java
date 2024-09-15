package com.artesanias.ludex.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RolesDTO {
    private Long id;

    @NotNull
    @Size(min = 3, max = 50, message = "{role_name.size}")
    private String name;

    @Size(max = 254, message = "{role_description.size}")
    private String description;

    @NotNull
    private Timestamp createdAt;

    @NotNull
    private Timestamp updatedAt;

    private Timestamp deletedAt;
}
