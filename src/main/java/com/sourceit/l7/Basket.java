package com.sourceit.l7;

/**
 * Is used for shopping basket items containing and processing
 */
public class Basket {
    private String totalSum;
    private String quantity;
    private Client client;
    private Item item;

    public Basket() {

    }

    public Basket(String totalSum, String quantity, Client client, Item item) {
        this.totalSum = totalSum;
        this.quantity = quantity;
        this.client = client;
        this.item = item;
    }

    public String getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(String totalSum) {
        this.totalSum = totalSum;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return this.toString();
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
