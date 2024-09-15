package com.artesanias.ludex.mappers;

import com.artesanias.ludex.dtos.UserDTO;
import com.artesanias.ludex.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-15T13:24:04-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22.0.2 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO toDTO(User entity) {
        if ( entity == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( entity.getId() );
        userDTO.setName( entity.getName() );
        userDTO.setImage( entity.getImage() );
        userDTO.setEmail( entity.getEmail() );
        userDTO.setPassword( entity.getPassword() );
        userDTO.setUserType( entity.getUserType() );
        userDTO.setCreatedAt( entity.getCreatedAt() );
        userDTO.setUpdatedAt( entity.getUpdatedAt() );
        userDTO.setDeletedAt( entity.getDeletedAt() );

        return userDTO;
    }

    @Override
    public User toEntity(UserDTO dto) {
        if ( dto == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.id( dto.getId() );
        user.name( dto.getName() );
        user.image( dto.getImage() );
        user.email( dto.getEmail() );
        user.password( dto.getPassword() );
        user.userType( dto.getUserType() );
        user.createdAt( dto.getCreatedAt() );
        user.updatedAt( dto.getUpdatedAt() );
        user.deletedAt( dto.getDeletedAt() );

        return user.build();
    }

    @Override
    public List<UserDTO> toDTOs(List<User> entities) {
        if ( entities == null ) {
            return null;
        }

        List<UserDTO> list = new ArrayList<UserDTO>( entities.size() );
        for ( User user : entities ) {
            list.add( toDTO( user ) );
        }

        return list;
    }

    @Override
    public List<User> toEntities(List<UserDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( dtos.size() );
        for ( UserDTO userDTO : dtos ) {
            list.add( toEntity( userDTO ) );
        }

        return list;
    }
}
