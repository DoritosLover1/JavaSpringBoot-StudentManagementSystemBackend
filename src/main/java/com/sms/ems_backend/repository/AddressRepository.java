package com.sms.ems_backend.repository;

import com.sms.ems_backend.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository  extends JpaRepository<Address, Integer> {

}
