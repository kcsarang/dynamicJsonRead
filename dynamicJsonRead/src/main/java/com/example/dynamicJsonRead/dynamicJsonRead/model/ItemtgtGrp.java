package com.example.dynamicJsonRead.dynamicJsonRead.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemtgtGrp{
    public String tgtGrpUuId;
    public String tgtGrpId;
    public String tgtGrpName;
    public String zzInclExcl;
    public String zzTgtGrpCode;
    public String customerCount;
}
