package com.mappings.respository;

import com.mappings.entities.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<AddressEntity,Long> {
}
