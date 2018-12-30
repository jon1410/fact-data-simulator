package de.iubh.fernstudium.iwbi.factdatasimulator.repository;

import de.iubh.fernstudium.iwbi.factdatasimulator.entity.DProduktgruppeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduktGruppeRepository extends JpaRepository<DProduktgruppeEntity, Long> {

    DProduktgruppeEntity findByKuerzel(String kuerzel);
}
