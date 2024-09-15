package com.artesanias.ludex.mappers;

import com.artesanias.ludex.dtos.RolesDTO;
import com.artesanias.ludex.model.Roles;
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
public class RolesMapperImpl implements RolesMapper {

    @Override
    public RolesDTO toDTO(Roles entity) {
        if ( entity == null ) {
            return null;
        }

        RolesDTO rolesDTO = new RolesDTO();

        rolesDTO.setId( entity.getId() );
        rolesDTO.setName( entity.getName() );
        rolesDTO.setDescription( entity.getDescription() );
        rolesDTO.setCreatedAt( entity.getCreatedAt() );
        rolesDTO.setUpdatedAt( entity.getUpdatedAt() );
        rolesDTO.setDeletedAt( entity.getDeletedAt() );

        return rolesDTO;
    }

    @Override
    public Roles toEntity(RolesDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Roles.RolesBuilder roles = Roles.builder();

        roles.id( dto.getId() );
        roles.name( dto.getName() );
        roles.description( dto.getDescription() );
        roles.createdAt( dto.getCreatedAt() );
        roles.updatedAt( dto.getUpdatedAt() );
        roles.deletedAt( dto.getDeletedAt() );

        return roles.build();
    }

    @Override
    public List<RolesDTO> toDTOs(List<Roles> entities) {
        if ( entities == null ) {
            return null;
        }

        List<RolesDTO> list = new ArrayList<RolesDTO>( entities.size() );
        for ( Roles roles : entities ) {
            list.add( toDTO( roles ) );
        }

        return list;
    }

    @Override
    public List<Roles> toEntities(List<RolesDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Roles> list = new ArrayList<Roles>( dtos.size() );
        for ( RolesDTO rolesDTO : dtos ) {
            list.add( toEntity( rolesDTO ) );
        }

        return list;
    }
}
