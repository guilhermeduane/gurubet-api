package com.gurubet.controller;


import com.gurubet.domain.Market;
import com.gurubet.service.MarketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/markets")
public class MarketController {

    private final MarketService marketService;

    public MarketController(MarketService marketService) {
        this.marketService = marketService;
    }


    @GetMapping
    public List<Market> getAllMarkets() {
        return marketService.getAllMarkets();
    }
}
