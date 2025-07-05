class Company 
{
	public static void main(String[] args) 
	{
        Employee s1=new Employee();
		s1.sno=100;
		s1.sname="subodh";
		s1.Course="cj";
		s1.Fee=1200;
		System.out.println(s1.sno);
		Employee s2=new Employee();
		s2.sno=101;
		s2.sname="sn";
		s2.Course="oracle";
		s2.Fee=1500;
		
	}
}
class Employee
{
	int sno;
	String sname;
	String dept;
	double Fee;
}