package de.iubh.fernstudium.iwbi.factdatasimulator.repository;

import de.iubh.fernstudium.iwbi.factdatasimulator.entity.DKundeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KundeRepository extends JpaRepository<DKundeEntity, Long> {
}
