package com.company.composition;

public class GiftCard {
    private long cardNumber;
    private float balance;
    private float totalAmount;

    public GiftCard (long cardNumber, float balance, float totalAmount){
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.totalAmount = totalAmount;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "GiftCard{" +
                "cardNumber=" + cardNumber +
                ", balance=" + balance +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
