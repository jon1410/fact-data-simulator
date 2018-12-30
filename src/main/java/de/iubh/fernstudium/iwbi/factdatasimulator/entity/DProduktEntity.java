package de.iubh.fernstudium.iwbi.factdatasimulator.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "d_produkt", schema = "iwbi", catalog = "")
public class DProduktEntity {
    private long id;
    private String kuerzel;
    private String beschreibung;
    private Timestamp giltvon;
    private Timestamp giltbis;
    private int version;
    private Byte aktiv;

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

    @Basic
    @Column(name = "version")
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Basic
    @Column(name = "aktiv")
    public Byte getAktiv() {
        return aktiv;
    }

    public void setAktiv(Byte aktiv) {
        this.aktiv = aktiv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DProduktEntity that = (DProduktEntity) o;
        return id == that.id &&
                version == that.version &&
                Objects.equals(kuerzel, that.kuerzel) &&
                Objects.equals(beschreibung, that.beschreibung) &&
                Objects.equals(giltvon, that.giltvon) &&
                Objects.equals(giltbis, that.giltbis) &&
                Objects.equals(aktiv, that.aktiv);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, kuerzel, beschreibung, giltvon, giltbis, version, aktiv);
    }
}
