package com.design.strategy.entity.h2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Table(name="CREDIT")
public class CreditRiskEntity {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    protected Long tradeId;

    @Column
    protected Double creditAmount;

    @Column
    protected Double creditRisk;

}
