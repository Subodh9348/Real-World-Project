class AccountInfo 
{
	public static void main(String[] args) 
	{
		BankAccount sn = new BankAccount();
		/*sn.bankName;
		sn.branchName;
		sn.ifscCode;*/
		sn.acNumber=12345678L;
		sn.acHName="subodh";
		sn.balance=1200;
		System.out.println(sn.bankName);
		System.out.println(sn.branchName);
		System.out.println(sn.ifscCode);
		System.out.println(sn.acNumber);
		System.out.println(sn.acHName);
		System.out.println(sn.balance+"\n");
		
		BankAccount sn1 = new BankAccount();
		sn1.acNumber=98765432L;
		sn1.acHName="sn";
		sn1.balance=12000;
		
		System.out.println("bank name is   :\t"+sn1.bankName);
		System.out.println("branch name is :\t"+sn1.branchName);
		System.out.println("ifsc code is   :\t"+sn1.ifscCode);
		System.out.println("account number is :\t"+sn1.acNumber);
		System.out.println("account holder name is: "+sn1.acHName);
		System.out.println("balance is :\t\t"+sn.balance);
		
		
	}
}
class BankAccount
{
	String bankName="hdfc bank";
	String branchName="Ameerpet";
	String ifscCode="Hdfc0001234";
	long acNumber;
	String acHName;
	double balance;
	
}
