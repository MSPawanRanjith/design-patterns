package com.design.strategy.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Collection;

import com.design.strategy.entity.h2.CreditRiskEntity;
import com.design.strategy.repository.CreditRepo;
import com.google.gson.Gson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditRiskData implements RiskData {

    @Autowired
    CreditRepo creditRepo;

    @Override
    public List<Object> getRiskData() {
        // connect to H2 to fetch data
        return ((Collection<CreditRiskEntity>) creditRepo.findAll()).stream().collect(Collectors.toList());
    }

    @Override
    public Object addRiskData(String object) {
        Gson gson = new Gson();
        return creditRepo.save(gson.fromJson(object, CreditRiskEntity.class));
    }
    
}
