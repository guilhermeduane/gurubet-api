package com.gurubet.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.time.Instant;
import java.util.Collection;

@Entity
@Data
@ToString(exclude = "odd")
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

    @OneToMany(mappedBy = "fixture", fetch = FetchType.LAZY)
    private Collection<Odd> odd;

}
