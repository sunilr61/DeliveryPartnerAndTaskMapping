package com.example.qcommerce.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data

public class PartnerTaskMapping extends BaseModel{
    private Partner partner;
    private Task task;
}
