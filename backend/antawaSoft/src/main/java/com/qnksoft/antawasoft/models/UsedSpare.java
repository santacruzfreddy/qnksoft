package com.qnksoft.antawasoft.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "usedSpares")
@Data
public class UsedSpare {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long usedSpareId;
    
    private String observation;
    
}
