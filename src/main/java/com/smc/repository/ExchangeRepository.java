package com.smc.repository;

import com.smc.entity.StockExchangeEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ExchangeRepository extends JpaRepository<StockExchangeEntity, Integer> {

}

