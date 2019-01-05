package de.iubh.fernstudium.iwbi.factdatasimulator.mapping;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.*;

@Service
public class ProduktToProduktGruppeMapping {

    private Set<String> sachVersicherungProdukte;
    private Set<String> personenVersicherungProdukte;

    @PostConstruct
    public void init() {
        sachVersicherungProdukte = new LinkedHashSet<>(Arrays.asList("HUHV", "EGHV", "HAHV", "KFZV", "RESV"));
        personenVersicherungProdukte = new LinkedHashSet<>(Arrays.asList("ERLV", "ABLV", "RALV", "KRKV", "EALV"));
    }

    public String getProduktGruppeForProdukt(String produktKey) {
        if (sachVersicherungProdukte.contains(produktKey)) {
            return "SV";
        }
        return "PV";
    }

    public Set<String> getSachVersicherungProdukte() {
        return sachVersicherungProdukte;
    }

    public Set<String> getPersonenVersicherungProdukte() {
        return personenVersicherungProdukte;
    }
}
