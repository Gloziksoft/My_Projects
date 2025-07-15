package com.poistenie.app.models.dto.mappers;

import com.poistenie.app.data.entities.InsuranceEntity;
import com.poistenie.app.data.entities.InsuredPersonEntity;
import com.poistenie.app.models.dto.InsuranceDTO;
import com.poistenie.app.models.dto.InsuredPersonDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-15T14:50:59+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 22.0.2 (Amazon.com Inc.)"
)
@Component
public class InsuredPersonMapperImpl implements InsuredPersonMapper {

    @Override
    public InsuredPersonDTO toDTO(InsuredPersonEntity entity) {
        if ( entity == null ) {
            return null;
        }

        InsuredPersonDTO insuredPersonDTO = new InsuredPersonDTO();

        insuredPersonDTO.setId( entity.getId() );
        insuredPersonDTO.setFirstName( entity.getFirstName() );
        insuredPersonDTO.setLastName( entity.getLastName() );
        insuredPersonDTO.setAge( (double) entity.getAge() );
        insuredPersonDTO.setEmail( entity.getEmail() );
        insuredPersonDTO.setPhone( entity.getPhone() );
        insuredPersonDTO.setStreet( entity.getStreet() );
        insuredPersonDTO.setCity( entity.getCity() );
        insuredPersonDTO.setPostalCode( entity.getPostalCode() );
        insuredPersonDTO.setInsurances( insuranceEntityListToInsuranceDTOList( entity.getInsurances() ) );

        return insuredPersonDTO;
    }

    @Override
    public InsuranceDTO toDTO(InsuranceEntity entity) {
        if ( entity == null ) {
            return null;
        }

        InsuranceDTO insuranceDTO = new InsuranceDTO();

        insuranceDTO.setInsuredPersonFirstName( entityInsuredPersonFirstName( entity ) );
        insuranceDTO.setInsuredPersonLastName( entityInsuredPersonLastName( entity ) );
        insuranceDTO.setPolicyHolderFirstName( entityPolicyHolderFirstName( entity ) );
        insuranceDTO.setPolicyHolderLastName( entityPolicyHolderLastName( entity ) );
        insuranceDTO.setInsuredPersonId( entityInsuredPersonId( entity ) );
        insuranceDTO.setPolicyHolderId( entityPolicyHolderId( entity ) );
        insuranceDTO.setId( entity.getId() );
        insuranceDTO.setInsuranceType( entity.getInsuranceType() );
        insuranceDTO.setStartDate( entity.getStartDate() );
        insuranceDTO.setEndDate( entity.getEndDate() );
        insuranceDTO.setInsuredAmount( entity.getInsuredAmount() );

        return insuranceDTO;
    }

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
    public InsuredPersonEntity toEntity(InsuredPersonDTO dto) {
        if ( dto == null ) {
            return null;
        }

        InsuredPersonEntity insuredPersonEntity = new InsuredPersonEntity();

        insuredPersonEntity.setId( dto.getId() );
        insuredPersonEntity.setFirstName( dto.getFirstName() );
        insuredPersonEntity.setLastName( dto.getLastName() );
        if ( dto.getAge() != null ) {
            insuredPersonEntity.setAge( dto.getAge().intValue() );
        }
        insuredPersonEntity.setEmail( dto.getEmail() );
        insuredPersonEntity.setStreet( dto.getStreet() );
        insuredPersonEntity.setCity( dto.getCity() );
        insuredPersonEntity.setPostalCode( dto.getPostalCode() );
        insuredPersonEntity.setPhone( dto.getPhone() );
        insuredPersonEntity.setInsurances( insuranceDTOListToInsuranceEntityList( dto.getInsurances() ) );

        return insuredPersonEntity;
    }

    @Override
    public void updateInsuredPersonDTO(InsuredPersonEntity source, InsuredPersonDTO target) {
        if ( source == null ) {
            return;
        }

        target.setId( source.getId() );
        target.setFirstName( source.getFirstName() );
        target.setLastName( source.getLastName() );
        target.setAge( (double) source.getAge() );
        target.setEmail( source.getEmail() );
        target.setPhone( source.getPhone() );
        target.setStreet( source.getStreet() );
        target.setCity( source.getCity() );
        target.setPostalCode( source.getPostalCode() );
        if ( target.getInsurances() != null ) {
            List<InsuranceDTO> list = insuranceEntityListToInsuranceDTOList( source.getInsurances() );
            if ( list != null ) {
                target.getInsurances().clear();
                target.getInsurances().addAll( list );
            }
            else {
                target.setInsurances( null );
            }
        }
        else {
            List<InsuranceDTO> list = insuranceEntityListToInsuranceDTOList( source.getInsurances() );
            if ( list != null ) {
                target.setInsurances( list );
            }
        }
    }

    @Override
    public void updateInsuredPersonEntity(InsuredPersonDTO source, InsuredPersonEntity target) {
        if ( source == null ) {
            return;
        }

        target.setId( source.getId() );
        target.setFirstName( source.getFirstName() );
        target.setLastName( source.getLastName() );
        if ( source.getAge() != null ) {
            target.setAge( source.getAge().intValue() );
        }
        target.setEmail( source.getEmail() );
        target.setStreet( source.getStreet() );
        target.setCity( source.getCity() );
        target.setPostalCode( source.getPostalCode() );
        target.setPhone( source.getPhone() );
        if ( target.getInsurances() != null ) {
            List<InsuranceEntity> list = insuranceDTOListToInsuranceEntityList( source.getInsurances() );
            if ( list != null ) {
                target.getInsurances().clear();
                target.getInsurances().addAll( list );
            }
            else {
                target.setInsurances( null );
            }
        }
        else {
            List<InsuranceEntity> list = insuranceDTOListToInsuranceEntityList( source.getInsurances() );
            if ( list != null ) {
                target.setInsurances( list );
            }
        }
    }

    protected List<InsuranceDTO> insuranceEntityListToInsuranceDTOList(List<InsuranceEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<InsuranceDTO> list1 = new ArrayList<InsuranceDTO>( list.size() );
        for ( InsuranceEntity insuranceEntity : list ) {
            list1.add( toDTO( insuranceEntity ) );
        }

        return list1;
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

    protected List<InsuranceEntity> insuranceDTOListToInsuranceEntityList(List<InsuranceDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<InsuranceEntity> list1 = new ArrayList<InsuranceEntity>( list.size() );
        for ( InsuranceDTO insuranceDTO : list ) {
            list1.add( toEntity( insuranceDTO ) );
        }

        return list1;
    }
}
