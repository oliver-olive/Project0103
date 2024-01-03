package org.example;


public class Main {
    public static void main(String[] args) {
        BankOperations bank = new BankOperations();
        BankOperations bank1 = new BankOperations();
        String[] words = {

                " Deposit 2396",
                " I want to transfer 3017 dollars to my account",
                " I want to pull 2300 dollars",
                "I want to deposit 3980 dollars",
                "I want to transfer 2811 dollars to my account"
        };

        for (String word : words) {
            bank.processOperation(word);
            bank.processOperation("see");
        }

        System.out.println();
        String[] words1 = {
                "I want to invest 4410",
                "I want to withdraw 161 dollars",
                "I want to withdraw 443",
                "I want to pull 4272 dollars",
                "Pull 375"
        };
        for (String word : words1) {
            bank1.processOperation(word);
            bank1.processOperation("see");
        }

    }

}