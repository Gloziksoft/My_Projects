package com.poistenie.app.models.dto.mappers;

import com.poistenie.app.data.entities.InsuranceEntity;
import com.poistenie.app.data.entities.InsuredPersonEntity;
import com.poistenie.app.models.dto.InsuranceDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-15T14:50:59+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 22.0.2 (Amazon.com Inc.)"
)
@Component
public class InsuranceMapperImpl implements InsuranceMapper {

    @Override
    public InsuranceEntity toEntity(InsuranceDTO dto) {
        if ( dto == null ) {
            return null;
        }

        InsuranceEntity insuranceEntity = new InsuranceEntity();

        insuranceEntity.setId( dto.getId() );
        insuranceEntity.setInsuranceType( dto.getInsuranceType() );
        insuranceEntity.setStartDate( dto.getStartDate() );
        insuranceEntity.setEndDate( dto.getEndDate() );
        insuranceEntity.setInsuredAmount( dto.getInsuredAmount() );

        return insuranceEntity;
    }

    @Override
    public InsuranceDTO toDTO(InsuranceEntity entity) {
        if ( entity == null ) {
            return null;
        }

        InsuranceDTO insuranceDTO = new InsuranceDTO();

        insuranceDTO.setInsuredPersonId( entityInsuredPersonId( entity ) );
        insuranceDTO.setPolicyHolderId( entityPolicyHolderId( entity ) );
        insuranceDTO.setInsuredPersonFirstName( entityInsuredPersonFirstName( entity ) );
        insuranceDTO.setInsuredPersonLastName( entityInsuredPersonLastName( entity ) );
        insuranceDTO.setPolicyHolderFirstName( entityPolicyHolderFirstName( entity ) );
        insuranceDTO.setPolicyHolderLastName( entityPolicyHolderLastName( entity ) );
        insuranceDTO.setId( entity.getId() );
        insuranceDTO.setInsuranceType( entity.getInsuranceType() );
        insuranceDTO.setStartDate( entity.getStartDate() );
        insuranceDTO.setEndDate( entity.getEndDate() );
        insuranceDTO.setInsuredAmount( entity.getInsuredAmount() );

        return insuranceDTO;
    }

    private Long entityInsuredPersonId(InsuranceEntity insuranceEntity) {
        if ( insuranceEntity == null ) {
            return null;
        }
        InsuredPersonEntity insuredPerson = insuranceEntity.getInsuredPerson();
        if ( insuredPerson == null ) {
            return null;
        }
        Long id = insuredPerson.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityPolicyHolderId(InsuranceEntity insuranceEntity) {
        if ( insuranceEntity == null ) {
            return null;
        }
        InsuredPersonEntity policyHolder = insuranceEntity.getPolicyHolder();
        if ( policyHolder == null ) {
            return null;
        }
        Long id = policyHolder.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String entityInsuredPersonFirstName(InsuranceEntity insuranceEntity) {
        if ( insuranceEntity == null ) {
            return null;
        }
        InsuredPersonEntity insuredPerson = insuranceEntity.getInsuredPerson();
        if ( insuredPerson == null ) {
            return null;
        }
        String firstName = insuredPerson.getFirstName();
        if ( firstName == null ) {
            return null;
        }
        return firstName;
    }

    private String entityInsuredPersonLastName(InsuranceEntity insuranceEntity) {
        if ( insuranceEntity == null ) {
            return null;
        }
        InsuredPersonEntity insuredPerson = insuranceEntity.getInsuredPerson();
        if ( insuredPerson == null ) {
            return null;
        }
        String lastName = insuredPerson.getLastName();
        if ( lastName == null ) {
            return null;
        }
        return lastName;
    }

    private String entityPolicyHolderFirstName(InsuranceEntity insuranceEntity) {
        if ( insuranceEntity == null ) {
            return null;
        }
        InsuredPersonEntity policyHolder = insuranceEntity.getPolicyHolder();
        if ( policyHolder == null ) {
            return null;
        }
        String firstName = policyHolder.getFirstName();
        if ( firstName == null ) {
            return null;
        }
        return firstName;
    }

    private String entityPolicyHolderLastName(InsuranceEntity insuranceEntity) {
        if ( insuranceEntity == null ) {
            return null;
        }
        InsuredPersonEntity policyHolder = insuranceEntity.getPolicyHolder();
        if ( policyHolder == null ) {
            return null;
        }
        String lastName = policyHolder.getLastName();
        if ( lastName == null ) {
            return null;
        }
        return lastName;
    }
}
