package com.artesanias.ludex.mappers;

import com.artesanias.ludex.dtos.RolesDTO;
import com.artesanias.ludex.model.Roles;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RolesMapper extends GenericMapper<RolesDTO, Roles>{
}
