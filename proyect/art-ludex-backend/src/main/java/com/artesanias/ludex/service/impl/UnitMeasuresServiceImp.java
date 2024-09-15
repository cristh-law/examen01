package com.artesanias.ludex.service.impl;

import com.artesanias.ludex.model.UnitMeasures;
import com.artesanias.ludex.repository.CrudGenericoRepository;
import com.artesanias.ludex.repository.UnitMeasuresRepository;
import com.artesanias.ludex.service.UnitMeasuresService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor

public class UnitMeasuresServiceImp extends CrudGenericoServiceImp<UnitMeasures, Long> implements UnitMeasuresService {


   private  final UnitMeasuresRepository unitMeasuresRepository;

    @Override
    public CrudGenericoRepository<UnitMeasures, Long> getRepo() {
        return unitMeasuresRepository;
    }
}
