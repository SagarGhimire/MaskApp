package com.Mask.NWMSUMask.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Entity
@Table(name="MASK_PICKUP_STUDENTS")
public class Students {
    @Id
    @Column(name="ID")
    @NotEmpty
    @Pattern(regexp = "[0-9]{9}", message = "should be 9 digit number")
    private String ID;
    @Column(name = "PICKEDUPPLACE")
    private String pickedPlace;
    @Column(name="PICKEDUPDATE")
    @Temporal(TemporalType.DATE)
    private Date pickedDate ;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPickedPlace() {
        return pickedPlace;
    }

    public void setPickedPlace(String pickedPlace) {
        this.pickedPlace = pickedPlace;
    }

    public Date getPickedDate() {
        return pickedDate;
    }

    public void setPickedDate(Date pickedDate) {
        this.pickedDate = pickedDate;
    }
}
