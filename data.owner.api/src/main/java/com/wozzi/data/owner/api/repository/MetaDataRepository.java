package com.wozzi.data.owner.api.repository;

import com.wozzi.data.owner.api.entity.MetaData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetaDataRepository extends JpaRepository<MetaData, Long> {
}
