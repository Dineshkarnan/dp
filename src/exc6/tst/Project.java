package exc6.tst;

import exc1.tst.Employee_Details;
import exc3.tst.CompanyDetails;

public class Project {
	public void myproject()
	{
		System.out.println("My automation project");
	}

	public static void main(String[] args) {
		Project pj = new Project();
		pj.myproject();
		
		/*Employee_Details class*/
		Employee_Details ed = new Employee_Details();
		ed.empid();
		ed.empname();
		ed.empdob();
		ed.empmobile();
		ed.empaddress();
		
		/*CompanyDetails Class*/
		CompanyDetails cd = new CompanyDetails();
		cd.Companyid();
		cd.Companyname();
		cd.Companyaddress();
	
	
	}
}
