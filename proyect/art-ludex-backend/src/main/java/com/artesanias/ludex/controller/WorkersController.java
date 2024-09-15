package com.artesanias.ludex.controller;

import com.artesanias.ludex.dtos.UserDTO;
import com.artesanias.ludex.dtos.WorkersDTO;
import com.artesanias.ludex.mappers.UserMapper;
import com.artesanias.ludex.mappers.WorkersMapper;
import com.artesanias.ludex.service.UserService;
import com.artesanias.ludex.service.WorkersService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/usuario")
public class WorkersController {
    @Autowired
    private WorkersService workersService;

    private final WorkersMapper workersMapper;

    @GetMapping("/lista")
    public ResponseEntity<List<WorkersDTO>> findAll() {
        List<WorkersDTO> u= workersMapper.toDTOs(workersService.findAll());
        return ResponseEntity.ok().body(u);
    }

    @GetMapping("/lista/{id}")
    public ResponseEntity<WorkersDTO> findByPerido(@PathVariable Long id) {
        WorkersDTO u=workersMapper.toDTO(workersService.findById(id));
        return ResponseEntity.ok().body(u);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody WorkersDTO u) {
        workersService.save(workersService.toEntity(u));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        workersService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
