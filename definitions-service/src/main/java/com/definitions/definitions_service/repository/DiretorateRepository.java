package com.definitions.definitions_service.repository;

import com.definitions.definitions_service.model.entity.DirectorateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiretorateRepository extends JpaRepository<DirectorateEntity, Long> {
}
