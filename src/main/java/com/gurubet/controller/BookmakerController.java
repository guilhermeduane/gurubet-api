package com.gurubet.controller;


import com.gurubet.domain.Bookmaker;
import com.gurubet.service.BookmakerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bookmakers")
public class BookmakerController {

    private final BookmakerService bookmakerService;

    public BookmakerController(BookmakerService bookmakerService) {
        this.bookmakerService = bookmakerService;
    }


    @GetMapping
    public List<Bookmaker> getAllBookmakers() {
        return bookmakerService.getAllBookmakers();
    }
}
