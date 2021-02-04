package com.Mask.NWMSUMask.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="spriden")
public class SpridenStudent {
    @Id
    @Column(name="SPRIDEN_ID")
    private String ID;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
