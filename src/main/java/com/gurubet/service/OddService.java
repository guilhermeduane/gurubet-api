package com.gurubet.service;



import com.gurubet.domain.Odd;
import com.gurubet.repository.OddRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OddService {

    private final OddRepository oddRepository;

    public OddService(OddRepository oddRepository) {
        this.oddRepository = oddRepository;
    }


    public List<Odd> getAllOdds() {
        return oddRepository.findAll();
    }
}
