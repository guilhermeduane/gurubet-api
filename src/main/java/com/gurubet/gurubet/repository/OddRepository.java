package com.gurubet.gurubet.repository;

import com.gurubet.gurubet.domain.Odd;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OddRepository extends JpaRepository<Odd, Long> {
}
