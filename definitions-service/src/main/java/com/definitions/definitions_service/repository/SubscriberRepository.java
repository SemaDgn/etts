package com.definitions.definitions_service.repository;

import com.definitions.definitions_service.model.entity.SubscriberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriberRepository extends JpaRepository<SubscriberEntity,Long> {
}
