package com.sourceit.l7;

/**
 * Is used for order containing and processing
 */
public class Order {
    private String number;
    private String shippingMethod;
    private Basket basket;
    private Payment payment;

    public  Order() {

    }

    public Order(String number, String shippingMethod, Basket basket, Payment payment) {
        this.number = number;
        this.shippingMethod = shippingMethod;
        this.basket = basket;
        this.payment = payment;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        Order order = new Order();
        return order.toString();
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
