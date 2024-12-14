package com.gurubet.gurubet.repository;

import com.gurubet.gurubet.domain.Market;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarketRepository extends JpaRepository<Market, Long> {
}
