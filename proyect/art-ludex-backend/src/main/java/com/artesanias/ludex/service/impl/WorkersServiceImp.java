package com.artesanias.ludex.service.impl;


import com.artesanias.ludex.model.Workers;
import com.artesanias.ludex.repository.CrudGenericoRepository;

import com.artesanias.ludex.service.WorkersService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class WorkersServiceImp extends CrudGenericoServiceImp<Workers, Long> implements WorkersService {

    private final WorkersServiceImp workersServiceImp;

    @Override
    protected CrudGenericoRepository<Workers, Long> getRepo() {return workersServiceImp;}
}
