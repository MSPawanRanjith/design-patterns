package com.design.strategy.service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import com.design.strategy.entity.mongo.MarketRiskDocument;
import com.design.strategy.repository.MarketRepo;
import com.google.gson.Gson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MarketRiskData implements RiskData {

    @Autowired
    MarketRepo marketRepo;

    @Override
    public List<Object> getRiskData() {
        // connect to Mongo to fetch data
        return ((Collection<MarketRiskDocument>) marketRepo.findAll()).stream().collect(Collectors.toList());
    }

    @Override
    public Object addRiskData(String object) {
        Gson gson = new Gson();
        return marketRepo.insert(gson.fromJson(object, MarketRiskDocument.class));
    }
    
    
}
