package com.sourceit.l7;

/**
 * Is used for containing and processing detailed information
 * about item
 */
public class ItemDetails {
    private String model;
    private String manufacturer;
    private String serialNumber;
    private String color;
    private String weight;

    public ItemDetails() {

    }

    public ItemDetails(String model, String manufacturer, String serialNumber, String color, String weight) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.color = color;
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        ItemDetails itemDetails = new ItemDetails();
        return itemDetails.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        return true;
    }

}
