package org.openpos.model;

import java.sql.Blob;
import java.util.Set;

public class AttributeGroup extends PricingAttributes {
    private int attributeGroupId;
    private Set<Value> values;
    private String barcode;
    private Blob image;

    public int getAttributeGroupId() {
        return attributeGroupId;
    }

    public void setAttributeGroupId(int attributeGroupId) {
        this.attributeGroupId = attributeGroupId;
    }

    public Set<Value> getValues() {
        return values;
    }

    public void setValues(Set<Value> values) {
        this.values = values;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "AttributeGroup{" +
                "attributeGroupId=" + attributeGroupId +
                ", values=" + values +
                ", barcode='" + barcode + '\'' +
                ", image=" + image +
                '}';
    }
}
