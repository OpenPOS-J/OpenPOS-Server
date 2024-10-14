package org.openpos.model;

import java.util.Date;

public class Damages extends PricingAttributes{
    private int damageId;
    private AttributeGroup attributeGroup;
    private String reason;
    private Date damageDate;

    public int getDamageId() {
        return damageId;
    }

    public void setDamageId(int damageId) {
        this.damageId = damageId;
    }

    public AttributeGroup getAttributeGroup() {
        return attributeGroup;
    }

    public void setAttributeGroup(AttributeGroup attributeGroup) {
        this.attributeGroup = attributeGroup;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getDamageDate() {
        return damageDate;
    }

    public void setDamageDate(Date damageDate) {
        this.damageDate = damageDate;
    }

    @Override
    public String toString() {
        return "Damages{" +
                "damageId=" + damageId +
                ", attributeGroup=" + attributeGroup +
                ", reason='" + reason + '\'' +
                ", damageDate=" + damageDate +
                '}';
    }
}
