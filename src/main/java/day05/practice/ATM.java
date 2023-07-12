package day05.practice;

public interface ATM {

	boolean deposit(Account account, double amount) throws Exception;

	boolean withdraw(Account account, double amount) throws Exception;

	double getBalance(Account account);
}