package com.qnksoft.antawasoft.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "transports")
@Data
public class Transport implements Serializable {
    @Id
    private Long transportId;
    
    private String description;
    
    private String licensePlate;
    
    private String color;

    private String qrCode;
    
    private Short numberWheels;
    
    @OneToMany
    private List<Maintenance> maintenances;
}
