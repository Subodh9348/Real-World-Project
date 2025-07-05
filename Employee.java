class Company 
{
	public static void main(String[] args) 
	{
        Employee s1=new Employee();
		s1.sno=100;
		s1.sname="subodh";
		s1.dept="cj";
		s1.Fee=1200;
		System.out.println(s1.sno);
		System.out.println(s1.sname);
		System.out.println(s1.dept);
		System.out.println(s1.Fee);
		Employee s2=new Employee();
		s2.sno=101;
		s2.sname="sn";
		s2.dept="oracle";
		s2.Fee=1500;
		System.out.println(s2.sno);
		System.out.println(s2.sname);
		System.out.println(s2.dept);
		System.out.println(s2.Fee);
	}
}
class Employee
{
	int sno;
	String sname;
	String dept;
	double Fee;
}