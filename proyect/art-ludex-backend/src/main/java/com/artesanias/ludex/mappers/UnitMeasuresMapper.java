package com.artesanias.ludex.mappers;

import com.artesanias.ludex.dtos.UnitMeasuresDTO;
import com.artesanias.ludex.model.UnitMeasures;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UnitMeasuresMapper extends GenericMapper<UnitMeasuresDTO, UnitMeasures>{
}
