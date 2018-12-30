package de.iubh.fernstudium.iwbi.factdatasimulator.repository;

import de.iubh.fernstudium.iwbi.factdatasimulator.entity.FUmsatzEntity;
import de.iubh.fernstudium.iwbi.factdatasimulator.entity.FUmsatzEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UmsatzRepository extends JpaRepository<FUmsatzEntity, FUmsatzEntityPK> {
}
