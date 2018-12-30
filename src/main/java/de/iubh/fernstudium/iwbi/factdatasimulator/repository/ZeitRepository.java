package de.iubh.fernstudium.iwbi.factdatasimulator.repository;

import de.iubh.fernstudium.iwbi.factdatasimulator.entity.DZeitEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZeitRepository extends JpaRepository<DZeitEntity, String> {
}
