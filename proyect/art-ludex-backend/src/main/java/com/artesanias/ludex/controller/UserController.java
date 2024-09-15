package com.artesanias.ludex.controller;

import com.artesanias.ludex.dtos.UserDTO;
import com.artesanias.ludex.mappers.UserMapper;
import com.artesanias.ludex.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/usuario")
public class UserController {
    @Autowired
    private UserService userService;

    private final UserMapper userMapper;

    @GetMapping("/lista")
    public ResponseEntity<List<UserDTO>> findAll() {
        List<UserDTO> u=userMapper.toDTOs(userService.findAll());
        return ResponseEntity.ok().body(u);
    }

    @GetMapping("/lista/{id}")
    public ResponseEntity<UserDTO> findByPerido(@PathVariable Long id) {
        UserDTO u=userMapper.toDTO(userService.findById(id));
        return ResponseEntity.ok().body(u);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody UserDTO u) {
        userService.save(userMapper.toEntity(u));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
