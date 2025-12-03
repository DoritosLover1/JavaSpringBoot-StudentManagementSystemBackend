package com.sms.ems_backend.mapper;

import com.sms.ems_backend.dto.AddressDto;
import com.sms.ems_backend.entity.Address;

public class AddressMapper {

    public static AddressDto mapToAddressDto(Address address) {
        return new AddressDto(
                address.getAddress_id(),
                address.getStreet(),
                address.getCity(),
                address.getState(),
                address.getZip(),
                address.getCountry()
        );
    }

    public static Address mapToAddress(AddressDto addressDto) {
        return new Address(
                addressDto.getAddress_id(),
                addressDto.getStreet(),
                addressDto.getCity(),
                addressDto.getState(),
                addressDto.getZip(),
                addressDto.getCountry()
        );
    }
}
