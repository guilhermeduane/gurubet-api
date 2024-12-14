package com.gurubet.gurubet.service;

import com.gurubet.gurubet.domain.Fixture;
import com.gurubet.gurubet.repository.FixtureRepository;
import com.gurubet.gurubet.repository.LeagueRepository;
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
