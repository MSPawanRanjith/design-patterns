package com.design.strategy.dto;

import com.design.strategy.enums.RiskTypeEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestDto {

    private RiskTypeEnum riskTypeEnum;
    private String riskObject;
    
}
