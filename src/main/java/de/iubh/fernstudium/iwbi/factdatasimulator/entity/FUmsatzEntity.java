package de.iubh.fernstudium.iwbi.factdatasimulator.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "f_umsatz", schema = "iwbi", catalog = "")
@IdClass(FUmsatzEntityPK.class)
public class FUmsatzEntity {
    private String zeitId;
    private long kundeId;
    private long prodgruppeId;
    private long produktId;

    private double umsatz;

    public FUmsatzEntity() {
    }

    public FUmsatzEntity(FUmsatzEntityPK pk, double umsatz) {
        this.zeitId = pk.getZeitId();
        this.kundeId = pk.getKundeId();
        this.prodgruppeId = pk.getProdgruppeId();
        this.produktId = pk.getProduktId();
        this.umsatz = umsatz;
    }

    @Id
    @Column(name = "zeit_id")
    public String getZeitId() {
        return zeitId;
    }

    public void setZeitId(String zeitId) {
        this.zeitId = zeitId;
    }

    @Id
    @Column(name = "kunde_id")
    public long getKundeId() {
        return kundeId;
    }

    public void setKundeId(long kundeId) {
        this.kundeId = kundeId;
    }

    @Id
    @Column(name = "prodgruppe_id")
    public long getProdgruppeId() {
        return prodgruppeId;
    }

    public void setProdgruppeId(long prodgruppeId) {
        this.prodgruppeId = prodgruppeId;
    }

    @Id
    @Column(name = "produkt_id")
    public long getProduktId() {
        return produktId;
    }

    public void setProduktId(long produktId) {
        this.produktId = produktId;
    }

    @Basic
    @Column(name = "umsatz")
    public double getUmsatz() {
        return umsatz;
    }

    public void setUmsatz(double umsatz) {
        this.umsatz = umsatz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FUmsatzEntity that = (FUmsatzEntity) o;
        return kundeId == that.kundeId &&
                prodgruppeId == that.prodgruppeId &&
                produktId == that.produktId &&
                Double.compare(that.umsatz, umsatz) == 0 &&
                Objects.equals(zeitId, that.zeitId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(zeitId, kundeId, prodgruppeId, produktId, umsatz);
    }
}
