package com.example.dynamicJsonRead.dynamicJsonRead.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item{
    public String externalProductId;
    public String posKeyId;
    public String posKeyValue;
}
