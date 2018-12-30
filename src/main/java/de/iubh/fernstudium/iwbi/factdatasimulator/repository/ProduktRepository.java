package de.iubh.fernstudium.iwbi.factdatasimulator.repository;

import de.iubh.fernstudium.iwbi.factdatasimulator.entity.DProduktEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduktRepository extends JpaRepository<DProduktEntity, Long> {
}
