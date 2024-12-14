package com.gurubet.controller;


import com.gurubet.domain.Odd;
import com.gurubet.service.OddService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/odds")
public class OddController {

    private final OddService oddService;

    public OddController(OddService oddService) {
        this.oddService = oddService;
    }


    @GetMapping
    public List<Odd> getAllOdds() {
        return oddService.getAllOdds();
    }
}
