package com.gurubet.domain;
import jakarta.persistence.*;
import lombok.Data;



@Entity
@Data
public class Bookmaker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
