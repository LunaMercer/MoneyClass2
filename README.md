Write a class encapsulating the concept of money, assuming that money has the following attributes: dollars, cents

In addition to the constructors, the accessors and mutators,  write the following methods:

public Money()

public Money(int dollars, int cents)

public Money add(Money m)

public Money substract(Money m)

public Money multiply(int m)

public static Money[] multiply(Money[] moneys, int amt)

public boolean equals(Money money)

public String toString()

private void normalize() // normalize dollars and cents field

Add additional helper methods if necessary.

Testing
Use the following test driver program to test your Money class:

Refer to MoneyTester.java
