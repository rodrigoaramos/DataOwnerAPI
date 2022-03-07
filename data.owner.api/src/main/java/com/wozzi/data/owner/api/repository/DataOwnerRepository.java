package com.wozzi.data.owner.api.repository;

import com.wozzi.data.owner.api.entity.DataOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataOwnerRepository extends JpaRepository<DataOwner, Long> {
}
