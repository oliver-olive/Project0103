package org.example;

public interface IBankAccountOperation {
    void deposit(double d);

    void withDraw(double d);

    double processOperation(String s);
}
