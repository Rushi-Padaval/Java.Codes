import java.util.*;
class SavingsAccount
{
private static double annualInterestRate;
private double savingsBalance;
SavingsAccount()
{
savingsBalance=0;
annualInterestRate=0;
}
SavingsAccount(double balance)
{
savingsBalance=balance;
annualInterestRate=0;
}
void calculateMonthlyInterest()
{
System.out.println("Current savings balance: "+savingsBalance);
double monthlyInterest;
monthlyInterest=(savingsBalance*annualInterestRate)/12;
savingsBalance+=monthlyInterest;
System.out.println("New savings balance: "+savingsBalance);
}
static void modifyInterestRate(double newInterestRate)
{
annualInterestRate=newInterestRate;
}
}
class Saving_test
{
public static void main(String[] args)
{
SavingsAccount saver1=new SavingsAccount(2000);
SavingsAccount saver2=new SavingsAccount(3000);
saver1.modifyInterestRate(.04);
saver1.calculateMonthlyInterest();
saver2.modifyInterestRate(.04);
saver2.calculateMonthlyInterest();
saver1.modifyInterestRate(.05);
saver1.calculateMonthlyInterest();
saver2.modifyInterestRate(.05);
saver2.calculateMonthlyInterest();
}
}