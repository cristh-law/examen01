package com.artesanias.ludex.service.impl;

import com.artesanias.ludex.model.Roles;
import com.artesanias.ludex.repository.CrudGenericoRepository;
import com.artesanias.ludex.repository.RolesRepository;
import com.artesanias.ludex.service.RolesService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@Transactional
@RequiredArgsConstructor
public class RolesServiceImp extends CrudGenericoServiceImp<Roles, Long> implements RolesService {

    private final RolesRepository rolesRepository;

    @Override
    protected CrudGenericoRepository<Roles, Long> getRepo() {
        return rolesRepository;
    }
}

