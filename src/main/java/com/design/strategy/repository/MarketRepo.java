package com.design.strategy.repository;

import com.design.strategy.entity.mongo.MarketRiskDocument;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MarketRepo extends MongoRepository<MarketRiskDocument, String> {
    
}
