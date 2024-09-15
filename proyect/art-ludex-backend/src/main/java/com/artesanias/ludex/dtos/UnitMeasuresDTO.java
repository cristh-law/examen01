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
public class UnitMeasuresDTO {
    private Long id;

    @NotNull
    @Size(min = 1, max = 50, message = "{unit_measures_name.size}")
    private String name;

    @NotNull
    private int unit;

    @Size(max = 254, message = "{unit_measures_description.size}")
    private String description;

    @NotNull
    private Timestamp createdAt;

    @NotNull
    private Timestamp updatedAt;
}
