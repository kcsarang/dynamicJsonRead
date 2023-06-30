package com.example.dynamicJsonRead.dynamicJsonRead.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemItOffer{
    public String internalSalesOrg;
    public String currency;
    public ZshowMat zshowMat;
    public LeadOfr leadOfr;
}
