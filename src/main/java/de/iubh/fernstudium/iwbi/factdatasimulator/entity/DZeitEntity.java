package de.iubh.fernstudium.iwbi.factdatasimulator.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "d_zeit", schema = "iwbi", catalog = "")
public class DZeitEntity {
    private String id;
    private Date datum;
    private Timestamp zeitstempel;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DATUM")
    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    @Basic
    @Column(name = "ZEITSTEMPEL")
    public Timestamp getZeitstempel() {
        return zeitstempel;
    }

    public void setZeitstempel(Timestamp zeitstempel) {
        this.zeitstempel = zeitstempel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DZeitEntity that = (DZeitEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(datum, that.datum) &&
                Objects.equals(zeitstempel, that.zeitstempel);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, datum, zeitstempel);
    }
}
