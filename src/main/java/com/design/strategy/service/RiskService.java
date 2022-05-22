package com.design.strategy.service;

import java.util.List;

import com.design.strategy.enums.RiskTypeEnum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RiskService {

    // TODO:
    // Autowire Strategy Helper that decides the strategy to implement

    public List<Object> getRiskData(RiskTypeEnum riskType) {
        // TODO:
        // 1. Get stratergy as per riskType
        // 2. Fetch Risk Data
        return null;
    }

    public Object addRiskData(RiskTypeEnum riskType, String object) {
        // TODO:
        // 1. Get stratergy as per riskType
        // 2. Add Risk Data
        return null;
    }
    
}
