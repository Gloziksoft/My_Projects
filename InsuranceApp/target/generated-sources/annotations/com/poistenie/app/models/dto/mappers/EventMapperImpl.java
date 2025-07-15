package com.poistenie.app.models.dto.mappers;

import com.poistenie.app.data.entities.EventEntity;
import com.poistenie.app.data.entities.InsuranceEntity;
import com.poistenie.app.models.dto.EventDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-15T14:50:59+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 22.0.2 (Amazon.com Inc.)"
)
@Component
public class EventMapperImpl implements EventMapper {

    @Override
    public EventDTO toDto(EventEntity entity) {
        if ( entity == null ) {
            return null;
        }

        EventDTO eventDTO = new EventDTO();

        eventDTO.setInsuranceId( entityInsuranceId( entity ) );
        eventDTO.setId( entity.getId() );
        eventDTO.setEventDate( entity.getEventDate() );
        eventDTO.setDescription( entity.getDescription() );

        return eventDTO;
    }

    @Override
    public EventEntity toEntity(EventDTO dto) {
        if ( dto == null ) {
            return null;
        }

        EventEntity eventEntity = new EventEntity();

        eventEntity.setInsurance( eventDTOToInsuranceEntity( dto ) );
        eventEntity.setId( dto.getId() );
        eventEntity.setEventDate( dto.getEventDate() );
        eventEntity.setDescription( dto.getDescription() );

        return eventEntity;
    }

    private Long entityInsuranceId(EventEntity eventEntity) {
        if ( eventEntity == null ) {
            return null;
        }
        InsuranceEntity insurance = eventEntity.getInsurance();
        if ( insurance == null ) {
            return null;
        }
        Long id = insurance.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected InsuranceEntity eventDTOToInsuranceEntity(EventDTO eventDTO) {
        if ( eventDTO == null ) {
            return null;
        }

        InsuranceEntity insuranceEntity = new InsuranceEntity();

        insuranceEntity.setId( eventDTO.getInsuranceId() );

        return insuranceEntity;
    }
}
