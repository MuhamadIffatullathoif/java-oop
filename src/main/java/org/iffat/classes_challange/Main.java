package org.iffat.classes_challange;

public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account("12345", 1000.00, "Bob Brown",
                "myemail@gmail.com", "(087) 123-4567");

//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(1000);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmail("myemail@gmail.com");
//        bobsAccount.setCustomerPhone("(087) 123-4567");

        bobsAccount.withdrawFunds(100);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);

        bobsAccount.withdrawFunds(54.45);
    }
}
