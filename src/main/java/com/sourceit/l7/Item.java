package com.sourceit.l7;

/**
 * Is used for item containing and processing
 */
public class Item {
    private String name;
    private String price;
    private Boolean availability;
    private String category;
    private ItemDetails itemDetails;


    public Item() {

    }

    public Item(String name, String price, Boolean availability, String category, ItemDetails itemDetails) {
        this.name = name;
        this.price = price;
        this.availability = availability;
        this.category = category;
        this.itemDetails = itemDetails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ItemDetails getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(ItemDetails itemDetails) {
        this.itemDetails = itemDetails;
    }

    @Override
    public String toString() {
        Item item = new Item();
        return item.toString();
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
