package com.sourceit.l7;

/**
 * Is used for containing and processing client's credit card information
 */
public class CreditCard extends Payment{
    private String number;
    private String expirationDate;
    private String cvv;

    public CreditCard() {

    }

    public CreditCard(String number, String expirationDate, String cvv) {
        this.number = number;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        CreditCard creditCard = new CreditCard();
        return creditCard.toString();
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
