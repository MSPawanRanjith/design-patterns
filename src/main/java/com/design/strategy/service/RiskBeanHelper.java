package com.design.strategy.service;

import com.design.strategy.enums.RiskTypeEnum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class RiskBeanHelper {

    // Application Context is Spring container that holds all the properties, beans, object been intialised and configured
    // applicationContext.getBean("BeanName") -> gives you the Bean of that name from spring environment 
    @Autowired
    ApplicationContext applicationContext;

    // TODO:
    // Implement getRiskDataStrategy function that decides what strtegy to be picked as per riskType
    
}
