package com.wozzi.data.owner.api.repository;

import com.wozzi.data.owner.api.entity.MetaDataType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetaDataTypeRepository extends JpaRepository<MetaDataType, Long> {
}
