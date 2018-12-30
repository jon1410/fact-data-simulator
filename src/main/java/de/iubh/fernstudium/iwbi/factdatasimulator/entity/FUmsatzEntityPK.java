package de.iubh.fernstudium.iwbi.factdatasimulator.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class FUmsatzEntityPK implements Serializable {
    private String zeitId;
    private long kundeId;
    private long prodgruppeId;
    private long produktId;

    @Column(name = "zeit_id")
    @Id
    public String getZeitId() {
        return zeitId;
    }

    public void setZeitId(String zeitId) {
        this.zeitId = zeitId;
    }

    @Column(name = "kunde_id")
    @Id
    public long getKundeId() {
        return kundeId;
    }

    public void setKundeId(long kundeId) {
        this.kundeId = kundeId;
    }

    @Column(name = "prodgruppe_id")
    @Id
    public long getProdgruppeId() {
        return prodgruppeId;
    }

    public void setProdgruppeId(long prodgruppeId) {
        this.prodgruppeId = prodgruppeId;
    }

    @Column(name = "produkt_id")
    @Id
    public long getProduktId() {
        return produktId;
    }

    public void setProduktId(long produktId) {
        this.produktId = produktId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FUmsatzEntityPK that = (FUmsatzEntityPK) o;
        return kundeId == that.kundeId &&
                prodgruppeId == that.prodgruppeId &&
                produktId == that.produktId &&
                Objects.equals(zeitId, that.zeitId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(zeitId, kundeId, prodgruppeId, produktId);
    }
}
