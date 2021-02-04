package com.Mask.NWMSUMask.model;


import javax.persistence.*;


@Entity
@Table(name ="MASK_PICKUP_ADMIN")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private int ID;
    @Column(name="USERNAME")
    private String userName;
    @Column(name="PASSWORD")
    private String password;

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
