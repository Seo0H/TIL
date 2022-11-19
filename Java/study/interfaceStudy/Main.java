package study.interfaceStudy;

public class Main {
	public static void main(String[] args) {
		
		Bank bank = new KBBank();
		bank.withDraw(1000);
		bank.deposit(1000);
		bank.findDormancyAcount("asdfg");
		Bank.BCAuth("KBBank");
	}
}
