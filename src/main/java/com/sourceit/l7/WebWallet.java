package com.sourceit.l7;

/**
 * Is used for containing and processing client's web wallet information
 */
public class WebWallet extends Payment{
    private String serviceName;
    private String accountNumber;
    private String expirationDate;

    public WebWallet() {

    }

    public WebWallet (String serviceName, String accountNumber, String expirationDate) {
        this.serviceName = serviceName;
        this.accountNumber = accountNumber;
        this.expirationDate = expirationDate;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
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
