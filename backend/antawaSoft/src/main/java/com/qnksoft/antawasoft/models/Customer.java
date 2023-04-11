package com.qnksoft.antawasoft.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "customers")
@Data
public class Customer implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long costumerId;
    
    private String firstName;
    
    private  String secondName;
    
    private String firstLastName;
    
    private String secondLastName;
    
    @Column(length = 13, nullable = false)
    private String identification;
    
    private String phone;
    
    private String email;
   
}
