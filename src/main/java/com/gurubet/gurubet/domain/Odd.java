package com.gurubet.gurubet.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class Odd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private BigDecimal value;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "bookmaker_id")
    private Bookmaker bookmaker;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "market_id")
    private Market market;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fixture_id")
    private Fixture fixture;
}
