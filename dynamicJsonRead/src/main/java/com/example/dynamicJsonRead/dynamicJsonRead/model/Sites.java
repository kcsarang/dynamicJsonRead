package com.example.dynamicJsonRead.dynamicJsonRead.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sites{
    public ArrayList<Itemsite> itemsites;
}