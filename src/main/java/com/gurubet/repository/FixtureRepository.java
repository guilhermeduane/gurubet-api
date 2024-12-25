package com.gurubet.repository;

import com.gurubet.domain.Fixture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FixtureRepository extends JpaRepository<Fixture, Long> {

}
