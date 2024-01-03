package org.example;

import java.util.HashSet;
import java.util.Set;

public class BankOperations implements IBankAccountOperation{
    public int balance = 0;
    Set<String> showBalance = new HashSet<>();
    Set<String> depositFunds = new HashSet<>();
    Set<String> withDrawFunds = new HashSet<>();

    @Override
    public void deposit(double d) {
        balance += d;
    }

    @Override
    public void withDraw(double d) {

        if(d > balance){
            System.out.println("Can't exceed the amount");
        }else{
            balance -= d;
        }
    }

    @Override
    public double processOperation(String s) {
        String[] words = s.split(" ");
        showBalance.add("see");
        showBalance.add("show");
        depositFunds.add("deposit");
        depositFunds.add("put");
        depositFunds.add("invest");
        depositFunds.add("transfer");
        withDrawFunds.add("withdraw");
        withDrawFunds.add("pull");
        double value = 0;
        String type = null;
        for(String word: words){
            String lowered  = word.toLowerCase();
            if(isNumber(lowered)){
                value = Double.parseDouble(lowered);
            }
            if(showBalance.contains(lowered)){
                type = "showBalance";

            } else if (depositFunds.contains(lowered)) {
                type = "deposit";

            } else if (withDrawFunds.contains(lowered)) {
                type = "withdraw";
            }
        }
        if( type == "deposit"){
            deposit(value);
            System.out.println("deposit " + value );
        } else if (type == "withdraw") {
            withDraw(value);
            System.out.println("withdraw " + value);
        } else if (type == "showBalance") {
            System.out.println("total balance is " + balance);
        }
        return balance;
    }
    public static boolean isNumber(String word){
        try {
            Double.parseDouble(word);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
