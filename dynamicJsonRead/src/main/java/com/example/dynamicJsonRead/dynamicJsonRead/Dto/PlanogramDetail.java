package com.example.dynamicJsonRead.dynamicJsonRead.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class PlanogramDetail{
    public String planogramId;
    public String planogramName;
}
