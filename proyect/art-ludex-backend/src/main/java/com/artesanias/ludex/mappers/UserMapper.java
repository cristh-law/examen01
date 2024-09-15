package com.artesanias.ludex.mappers;

import com.artesanias.ludex.dtos.UserDTO;
import com.artesanias.ludex.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends GenericMapper<UserDTO, User> {
}
