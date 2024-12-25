package com.gurubet.controller;

import com.gurubet.domain.Fixture;
import com.gurubet.service.FixtureService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/fixtures")
public class FixtureController {
    private final FixtureService fixtureService;

    public FixtureController(FixtureService fixtureService) {
        this.fixtureService = fixtureService;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public List<Fixture> getAllFixtures() {
        return fixtureService.getAllFixtures();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/high-odds")
    public List<Fixture> getAllFixturesWithHighOdds() {
        return fixtureService.getAllFixturesWithHighOdds();
    }
}
