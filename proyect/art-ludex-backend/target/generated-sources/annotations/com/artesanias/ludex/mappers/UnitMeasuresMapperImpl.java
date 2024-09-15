package com.artesanias.ludex.mappers;

import com.artesanias.ludex.dtos.UnitMeasuresDTO;
import com.artesanias.ludex.model.UnitMeasures;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-15T13:24:03-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22.0.2 (Oracle Corporation)"
)
@Component
public class UnitMeasuresMapperImpl implements UnitMeasuresMapper {

    @Override
    public UnitMeasuresDTO toDTO(UnitMeasures entity) {
        if ( entity == null ) {
            return null;
        }

        UnitMeasuresDTO unitMeasuresDTO = new UnitMeasuresDTO();

        unitMeasuresDTO.setId( entity.getId() );
        unitMeasuresDTO.setName( entity.getName() );
        unitMeasuresDTO.setUnit( entity.getUnit() );
        unitMeasuresDTO.setDescription( entity.getDescription() );
        unitMeasuresDTO.setCreatedAt( entity.getCreatedAt() );
        unitMeasuresDTO.setUpdatedAt( entity.getUpdatedAt() );

        return unitMeasuresDTO;
    }

    @Override
    public UnitMeasures toEntity(UnitMeasuresDTO dto) {
        if ( dto == null ) {
            return null;
        }

        UnitMeasures.UnitMeasuresBuilder unitMeasures = UnitMeasures.builder();

        unitMeasures.id( dto.getId() );
        unitMeasures.name( dto.getName() );
        unitMeasures.unit( dto.getUnit() );
        unitMeasures.description( dto.getDescription() );
        unitMeasures.createdAt( dto.getCreatedAt() );
        unitMeasures.updatedAt( dto.getUpdatedAt() );

        return unitMeasures.build();
    }

    @Override
    public List<UnitMeasuresDTO> toDTOs(List<UnitMeasures> entities) {
        if ( entities == null ) {
            return null;
        }

        List<UnitMeasuresDTO> list = new ArrayList<UnitMeasuresDTO>( entities.size() );
        for ( UnitMeasures unitMeasures : entities ) {
            list.add( toDTO( unitMeasures ) );
        }

        return list;
    }

    @Override
    public List<UnitMeasures> toEntities(List<UnitMeasuresDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<UnitMeasures> list = new ArrayList<UnitMeasures>( dtos.size() );
        for ( UnitMeasuresDTO unitMeasuresDTO : dtos ) {
            list.add( toEntity( unitMeasuresDTO ) );
        }

        return list;
    }
}
