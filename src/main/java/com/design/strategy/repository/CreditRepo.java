package com.design.strategy.repository;

import com.design.strategy.entity.h2.CreditRiskEntity;

import org.springframework.data.repository.CrudRepository;

public interface CreditRepo extends CrudRepository<CreditRiskEntity, Long> {
    
}
