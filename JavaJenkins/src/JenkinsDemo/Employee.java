package JenkinsDemo;

public class Employee {
    protected int empId;
    protected String name,dept;
    double bSal,hra,da;
    
    public Employee() {
    	empId=1001;
    	name="Apurva";
    	dept="Accounts";
    	bSal=500000;
    	hra=10000;
    	da=3000;
    }
    public double calSalary() {
    	return bSal+hra+da;
    }
    public Employee(int id,String nm,String dt,int sal,int hr,int d) {
    	empId=id;
    	name=nm;
    	dept=dt;
    	bSal=sal;
    	hra=hr;
    	da=d;
    }
  
	@Override
	public String toString() {
		return "Employee --- empId=" + empId + ", name=" + name + ", dept=" + dept + ", bSal=" + bSal + ", hra=" + hra
				+ ", da=" + da;
	}
	public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(1002,"Arjun","Executive",450000,1200,1000);
        System.out.println(e1);
        System.out.println(e2);

	}

}
