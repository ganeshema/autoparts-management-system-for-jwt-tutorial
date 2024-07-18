package com.ganeshgc.autopartsmanagementsystem.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartsDto {
        private int id;
        private String partName;
        private String partNumber;
        private int quantity;
        private double price;

    }


