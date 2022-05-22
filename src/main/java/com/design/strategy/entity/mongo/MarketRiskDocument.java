package com.design.strategy.entity.mongo;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Document(collection = "market")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MarketRiskDocument {
    
    @Id
    protected Long tradeId;

    protected Double markToMarketValue;
    protected Double marketRisk;
}
