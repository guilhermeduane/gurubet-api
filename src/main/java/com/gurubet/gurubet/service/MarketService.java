package com.gurubet.gurubet.service;



import com.gurubet.gurubet.domain.Market;
import com.gurubet.gurubet.repository.MarketRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketService {

    private final MarketRepository marketRepository;

    public MarketService(MarketRepository marketRepository) {
        this.marketRepository = marketRepository;
    }


    public List<Market> getAllMarkets() {
        return marketRepository.findAll();
    }
}
