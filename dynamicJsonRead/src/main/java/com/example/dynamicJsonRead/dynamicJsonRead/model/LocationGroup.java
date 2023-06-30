package com.example.dynamicJsonRead.dynamicJsonRead.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LocationGroup{
    public String externalLocationHierarchyId;
    public String locationHierarchyId;
    public Location location;
    public String externalLocationHierarchyNodeId;
}
