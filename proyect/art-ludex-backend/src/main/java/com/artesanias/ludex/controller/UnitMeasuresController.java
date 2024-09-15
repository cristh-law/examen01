package com.artesanias.ludex.controller;

import com.artesanias.ludex.dtos.UnitMeasuresDTO;
import com.artesanias.ludex.mappers.UnitMeasuresMapper;
import com.artesanias.ludex.service.UnitMeasuresService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/unit_measures")
public class UnitMeasuresController {

    @Autowired
    private UnitMeasuresService unitMeasuresService;

    private final UnitMeasuresMapper unitMeasuresMapper;

    @GetMapping("/lista")
    public ResponseEntity<List<UnitMeasuresDTO>> findAll() {
        List<UnitMeasuresDTO> units = unitMeasuresMapper.toDTOs(unitMeasuresService.findAll());
        return ResponseEntity.ok().body(units);
    }

    @GetMapping("/lista/{id}")
    public ResponseEntity<UnitMeasuresDTO> findById(@PathVariable Long id) {
        UnitMeasuresDTO unit = unitMeasuresMapper.toDTO(unitMeasuresService.findById(id));
        return ResponseEntity.ok().body(unit);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody UnitMeasuresDTO unit) {
        unitMeasuresService.save(unitMeasuresMapper.toEntity(unit));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        unitMeasuresService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
