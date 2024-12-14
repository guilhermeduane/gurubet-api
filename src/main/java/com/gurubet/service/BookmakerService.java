package com.gurubet.service;


import com.gurubet.domain.Bookmaker;
import com.gurubet.repository.BookmakerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookmakerService {

    private final BookmakerRepository bookmakerRepository;

    public BookmakerService(BookmakerRepository bookmakerRepository) {
        this.bookmakerRepository = bookmakerRepository;
    }

    public List<Bookmaker> getAllBookmakers() {
        return bookmakerRepository.findAll();
    }
}
