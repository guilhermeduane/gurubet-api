package com.gurubet.service;

import com.gurubet.domain.Fixture;
import com.gurubet.repository.FixtureRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FixtureService {

    private final FixtureRepository fixtureRepository;

    public FixtureService(FixtureRepository fixtureRepository) {
        this.fixtureRepository = fixtureRepository;
    }

    public List<Fixture> getAllFixtures() {
        return fixtureRepository.findAll();
    }
}
