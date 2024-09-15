package com.artesanias.ludex.mappers;

import com.artesanias.ludex.dtos.WorkersDTO;
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
public class WorkersMapperImpl implements WorkersMapper {

    @Override
    public WorkersDTO toDTO(User entity) {
        if ( entity == null ) {
            return null;
        }

        WorkersDTO workersDTO = new WorkersDTO();

        workersDTO.setId( entity.getId() );
        workersDTO.setName( entity.getName() );

        return workersDTO;
    }

    @Override
    public User toEntity(WorkersDTO dto) {
        if ( dto == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.id( dto.getId() );
        user.name( dto.getName() );

        return user.build();
    }

    @Override
    public List<WorkersDTO> toDTOs(List<User> entities) {
        if ( entities == null ) {
            return null;
        }

        List<WorkersDTO> list = new ArrayList<WorkersDTO>( entities.size() );
        for ( User user : entities ) {
            list.add( toDTO( user ) );
        }

        return list;
    }

    @Override
    public List<User> toEntities(List<WorkersDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( dtos.size() );
        for ( WorkersDTO workersDTO : dtos ) {
            list.add( toEntity( workersDTO ) );
        }

        return list;
    }
}
