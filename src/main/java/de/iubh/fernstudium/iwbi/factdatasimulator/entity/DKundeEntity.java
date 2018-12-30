package de.iubh.fernstudium.iwbi.factdatasimulator.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "d_kunde", schema = "iwbi", catalog = "")
public class DKundeEntity {
    private long idKunde;
    private long knrQuelle;
    private String quellsystem;
    private String vorname;
    private String nachname;
    private Timestamp giltvon;
    private Timestamp giltbis;

    @Id
    @Column(name = "id_kunde")
    public long getIdKunde() {
        return idKunde;
    }

    public void setIdKunde(long idKunde) {
        this.idKunde = idKunde;
    }

    @Basic
    @Column(name = "knr_quelle")
    public long getKnrQuelle() {
        return knrQuelle;
    }

    public void setKnrQuelle(long knrQuelle) {
        this.knrQuelle = knrQuelle;
    }

    @Basic
    @Column(name = "quellsystem")
    public String getQuellsystem() {
        return quellsystem;
    }

    public void setQuellsystem(String quellsystem) {
        this.quellsystem = quellsystem;
    }

    @Basic
    @Column(name = "vorname")
    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    @Basic
    @Column(name = "nachname")
    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    @Basic
    @Column(name = "giltvon")
    public Timestamp getGiltvon() {
        return giltvon;
    }

    public void setGiltvon(Timestamp giltvon) {
        this.giltvon = giltvon;
    }

    @Basic
    @Column(name = "giltbis")
    public Timestamp getGiltbis() {
        return giltbis;
    }

    public void setGiltbis(Timestamp giltbis) {
        this.giltbis = giltbis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DKundeEntity that = (DKundeEntity) o;
        return idKunde == that.idKunde &&
                knrQuelle == that.knrQuelle &&
                Objects.equals(quellsystem, that.quellsystem) &&
                Objects.equals(vorname, that.vorname) &&
                Objects.equals(nachname, that.nachname) &&
                Objects.equals(giltvon, that.giltvon) &&
                Objects.equals(giltbis, that.giltbis);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idKunde, knrQuelle, quellsystem, vorname, nachname, giltvon, giltbis);
    }
}
