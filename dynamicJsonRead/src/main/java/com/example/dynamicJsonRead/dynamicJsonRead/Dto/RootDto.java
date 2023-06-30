package com.example.dynamicJsonRead.dynamicJsonRead.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component

public class RootDto {
    public String offerId;
    public String importParameterTimestamp;
    public ArrayList<Proforma> proformas;
    public ArrayList<PlanogramDetail> planogramDetails;
}
