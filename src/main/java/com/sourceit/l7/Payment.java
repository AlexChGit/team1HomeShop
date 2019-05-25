package com.sourceit.l7;

/**
 * Is used for payment information containing and processing
 */
public class Payment {
    private String currency;
    private String date;

    public Payment(){

    }

    public Payment(String currency, String date) {
        this.currency = currency;
        this.date = date;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        Payment payment = new Payment();
        return payment.toString();
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
