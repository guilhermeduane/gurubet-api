package com.gurubet.gurubet.repository;

import com.gurubet.gurubet.domain.Bookmaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookmakerRepository extends JpaRepository<Bookmaker, Long> {
}
