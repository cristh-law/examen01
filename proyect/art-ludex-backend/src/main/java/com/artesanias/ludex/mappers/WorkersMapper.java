package com.artesanias.ludex.mappers;

import com.artesanias.ludex.dtos.UserDTO;
import com.artesanias.ludex.dtos.WorkersDTO;
import com.artesanias.ludex.model.User;
import com.artesanias.ludex.model.Workers;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WorkersMapper extends GenericMapper<WorkersDTO, Workers> {
}
