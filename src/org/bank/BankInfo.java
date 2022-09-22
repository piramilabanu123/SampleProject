package org.bank;

public class BankInfo extends AxisBank {
	public void bankDetails() {
		System.out.println("enter the Bank Details");

	}
	private void savingAcc() {
		System.out.println();
	}
	private void fixedAcc() {
		System.out.println();
	}
private void depositAcc() {
	System.out.println("Enter the Deposit account IS:567893");

}
public static void main(String[] args) {
BankInfo b=new BankInfo();
b.savingAcc();
b.fixedAcc();
b.depositAcc();

}
}