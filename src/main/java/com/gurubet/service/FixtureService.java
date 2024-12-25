package com.gurubet.service;

import com.gurubet.domain.Fixture;
import com.gurubet.domain.Odd;
import com.gurubet.repository.FixtureRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
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

    public List<Fixture> getAllFixturesWithHighOdds() {
        List<Fixture> fixtures = fixtureRepository.findAll();

        for (Fixture fixture : fixtures) {
            Collection<Odd> odds = fixture.getOdd();

            Odd highestHomeOdd = null;
            Odd highestDrawOdd = null;
            Odd highestAwayOdd = null;

            for (Odd odd : odds) {
                String oddName = odd.getName();

                if ("Home".equalsIgnoreCase(oddName)) {
                    if (highestHomeOdd == null || odd.getValue().compareTo(highestHomeOdd.getValue()) > 0) {
                        highestHomeOdd = odd;
                    }
                } else if ("Draw".equalsIgnoreCase(oddName)) {
                    if (highestDrawOdd == null || odd.getValue().compareTo(highestDrawOdd.getValue()) > 0) {
                        highestDrawOdd = odd;
                    }
                } else if ("Away".equalsIgnoreCase(oddName)) {
                    if (highestAwayOdd == null || odd.getValue().compareTo(highestAwayOdd.getValue()) > 0) {
                        highestAwayOdd = odd;
                    }
                }
            }

            odds.clear();

            if (highestHomeOdd != null) {
                odds.add(highestHomeOdd);
            }
            if (highestDrawOdd != null) {
                odds.add(highestDrawOdd);
            }
            if (highestAwayOdd != null) {
                odds.add(highestAwayOdd);
            }
        }

        return fixtures;
    }
}
