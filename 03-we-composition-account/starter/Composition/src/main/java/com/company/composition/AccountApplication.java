package com.company.composition;

public class AccountApplication {
    public static void main(String[] args) {
        BetterAccount account = new BetterAccount("eloys", "robles", "er");
        Address homeAddress = new Address("street", "city", "state", "zip");
        Address billingAddress = new Address("street", "city", "state", "zip");
        GiftCard giftCard = new GiftCard(123123123, 45.69f, 50.00f);
        account.setHomeAddress(homeAddress);
        account.setBillingAddress(billingAddress);
        account.setGiftCard(giftCard);

        System.out.println(account);
    }




}
