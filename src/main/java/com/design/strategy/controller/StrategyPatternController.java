package com.design.strategy.controller;

import java.util.List;

import com.design.strategy.dto.RequestDto;
import com.design.strategy.enums.RiskTypeEnum;
import com.design.strategy.service.RiskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/strategy")
@Slf4j
public class StrategyPatternController {

    @Autowired
    RiskService riskService;

    
    @RequestMapping(value = "/getRisk", method = RequestMethod.GET)
    @ResponseBody
    public List<Object> getRiskData(@RequestParam RiskTypeEnum riskType) {
        log.info("Calling Risk service for the riskType: {}", riskType);
        return riskService.getRiskData(riskType);
    }

    @RequestMapping(value = "/addRisk", method = RequestMethod.POST)
    @ResponseBody
    public Object addRiskData(@RequestBody RequestDto request) {
        return riskService.addRiskData(request.getRiskTypeEnum(), request.getRiskObject());
    }
    

}
