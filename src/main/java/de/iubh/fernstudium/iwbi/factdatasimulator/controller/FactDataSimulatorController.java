package de.iubh.fernstudium.iwbi.factdatasimulator.controller;

import de.iubh.fernstudium.iwbi.factdatasimulator.entity.*;
import de.iubh.fernstudium.iwbi.factdatasimulator.mapping.ProduktToProduktGruppeMapping;
import de.iubh.fernstudium.iwbi.factdatasimulator.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/facts")
public class FactDataSimulatorController {

    @Autowired
    private KundeRepository kundeRepository;
    @Autowired
    private ProduktRepository produktRepository;
    @Autowired
    private ProduktGruppeRepository produktGruppeRepository;
    @Autowired
    private UmsatzRepository umsatzRepository;
    @Autowired
    private ZeitRepository zeitRepository;
    @Autowired
    private ProduktToProduktGruppeMapping produktToProduktGruppeMapping;

    private List<DProduktEntity> produkte;
    private int produkteSize;

    @GetMapping
    public String isAlive(){
        return "ALIVE!";
    }

    @PostMapping("/test/generate")
    public String testPost(@RequestParam(value="timekey", required=true) String timekey) {

        System.out.println(timekey);
        return timekey;
    }

    @PostMapping("/generate")
    public String generateRandomFacts(@RequestParam(value="timekey", required=true) String timekey) {

        DZeitEntity zeitEntity = zeitRepository.getOne(timekey);
        if (zeitEntity == null) {
            throw new RuntimeException("given timekey is invalid!");
        }

        List<DKundeEntity> allKunden = kundeRepository.findAll();
        produkte = produktRepository.findAll();
        produkteSize = produkte.size()-1;
        allKunden.forEach((k) -> this.createUmsatzEntry(k, timekey));

        return "Generating Fact Data done";
    }

    private void createUmsatzEntry(DKundeEntity kundeEntity, String timeKey) {
        long sizeOfProducts = randBetween(0, 5);

        for (int i = 0; i < sizeOfProducts; i++) {
            FUmsatzEntityPK umsatzEntityPK = createUmsatzPK(kundeEntity.getIdKunde(), timeKey);
            FUmsatzEntity umsatzEntity = new FUmsatzEntity(umsatzEntityPK, createUmsatzValue());
            umsatzRepository.saveAndFlush(umsatzEntity);
        }
    }

    private double createUmsatzValue() {
        Random r = new Random();
        return 10 + (1000 - 10) * r.nextDouble();
    }

    private FUmsatzEntityPK createUmsatzPK(long idKunde, String timeKey) {
        DProduktEntity produktEntity = produkte.get(randBetween(0, produkteSize));
        FUmsatzEntityPK pk = new FUmsatzEntityPK();
        pk.setKundeId(idKunde);
        pk.setProdgruppeId(getProduktGruppeIdFromProdukt(produktEntity.getKuerzel()));
        pk.setProduktId(produktEntity.getId());
        pk.setZeitId(timeKey);
        return pk;
    }

    private long getProduktGruppeIdFromProdukt(String produktKuerzel) {
        String prodGruppeKuerzel = produktToProduktGruppeMapping.getProduktGruppeForProdukt(produktKuerzel);
        return produktGruppeRepository.findByKuerzel(prodGruppeKuerzel).getId();
    }

    private int randBetween(int start, int end) {
        return  (start + (int)Math.round(Math.random() * (end - start)));
    }
}
