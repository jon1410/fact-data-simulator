package de.iubh.fernstudium.iwbi.factdatasimulator.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "d_produktgruppe", schema = "iwbi", catalog = "")
public class DProduktgruppeEntity {
    private long id;
    private String kuerzel;
    private String beschreibung;
    private String beschreibungAlt;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "kuerzel")
    public String getKuerzel() {
        return kuerzel;
    }

    public void setKuerzel(String kuerzel) {
        this.kuerzel = kuerzel;
    }

    @Basic
    @Column(name = "beschreibung")
    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    @Basic
    @Column(name = "beschreibung_alt")
    public String getBeschreibungAlt() {
        return beschreibungAlt;
    }

    public void setBeschreibungAlt(String beschreibungAlt) {
        this.beschreibungAlt = beschreibungAlt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DProduktgruppeEntity that = (DProduktgruppeEntity) o;
        return id == that.id &&
                Objects.equals(kuerzel, that.kuerzel) &&
                Objects.equals(beschreibung, that.beschreibung) &&
                Objects.equals(beschreibungAlt, that.beschreibungAlt);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, kuerzel, beschreibung, beschreibungAlt);
    }
}
