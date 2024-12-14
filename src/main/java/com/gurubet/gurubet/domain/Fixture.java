package com.gurubet.gurubet.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;

@Entity
@Data
public class Fixture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant timestamp;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "league_id")
    private League league;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "team_home_id")
    private Team teamHome;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "team_away_id")
    private Team teamAway;

}
