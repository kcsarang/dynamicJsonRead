package com.example.dynamicJsonRead.dynamicJsonRead.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Itembuy{
    public String prodDiscountAssignment;
    public String productDimensionTypeCode;
    public String termSequenceNr;
    public String productQtyUom;
    public String termTypeCode;
    public TermProducts termProducts;
    public String productHierarchyNodeId;
    public String discountTypeCode;
    public String termId;
    public String discVal;
    public String productHierarchyId;
    public String externalProductHierarchyId;
    public String dispPromotionCostPriceCurrency;
    public String internalProductId;
    public String productMaterialDiscountTypeCode;
    public String productVariety;
    public String productQty;
    public String currencyCode;
    public String promotedUom;
    public String operationTypeCode;
}
