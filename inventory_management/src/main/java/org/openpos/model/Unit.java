package org.openpos.model;

public class Unit {
    private int unitId;
    private String name;
    private double value;

    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "unitId=" + unitId +
                ", name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
