package com.giselletech.nlw_journey.link;

import com.giselletech.nlw_journey.participant.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface LinkRepository extends JpaRepository<Link, UUID> {

    List<Link> findByTripId(UUID tripId);
}
