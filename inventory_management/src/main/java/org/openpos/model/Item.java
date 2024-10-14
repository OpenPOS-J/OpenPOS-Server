package org.openpos.model;

import java.util.Set;

public class Item {
    private int itemId;
    private String name;
    private String description;
    private Set<Attribute> attributes;
    private Set<AttributeGroup> attributeGroups;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public Set<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(Set<Attribute> attributes) {
        this.attributes = attributes;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<AttributeGroup> getAttributeGroups() {
        return attributeGroups;
    }

    public void setAttributeGroups(Set<AttributeGroup> attributeGroups) {
        this.attributeGroups = attributeGroups;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", attributes=" + attributes +
                ", attributeGroups=" + attributeGroups +
                '}';
    }
}
