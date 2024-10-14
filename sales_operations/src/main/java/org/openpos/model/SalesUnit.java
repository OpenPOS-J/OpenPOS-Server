package org.openpos.model;

import java.util.Date;

public class SalesUnit extends PricingAttributes {
    private int salesUnitId;
    private AttributeGroup attributeGroup;
    private Date dateOfSale;

    public int getSalesUnitId() {
        return salesUnitId;
    }

    public void setSalesUnitId(int salesUnitId) {
        this.salesUnitId = salesUnitId;
    }

    public AttributeGroup getAttributeGroup() {
        return attributeGroup;
    }

    public void setAttributeGroup(AttributeGroup attributeGroup) {
        this.attributeGroup = attributeGroup;
    }

    public Date getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(Date dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    @Override
    public String toString() {
        return "SalesUnit{" +
                "salesUnitId=" + salesUnitId +
                ", attributeGroup=" + attributeGroup +
                ", dateOfSale=" + dateOfSale +
                '}';
    }
}
