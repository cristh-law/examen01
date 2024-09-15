package com.artesanias.ludex.controller;

import com.artesanias.ludex.dtos.RolesDTO;
import com.artesanias.ludex.mappers.RolesMapper;
import com.artesanias.ludex.service.RolesService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/roles")
public class RolesController {

    @Autowired
    private RolesService rolesService;

    private final RolesMapper rolesMapper;

    @GetMapping("/lista")
    public ResponseEntity<List<RolesDTO>> findAll() {
        List<RolesDTO> roles = rolesMapper.toDTOs(rolesService.findAll());
        return ResponseEntity.ok().body(roles);
    }

    @GetMapping("/lista/{id}")
    public ResponseEntity<RolesDTO> findById(@PathVariable Long id) {
        RolesDTO role = rolesMapper.toDTO(rolesService.findById(id));
        return ResponseEntity.ok().body(role);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody RolesDTO role) {
        rolesService.save(rolesMapper.toEntity(role));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        rolesService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

