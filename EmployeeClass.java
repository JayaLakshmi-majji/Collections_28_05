package ArrayListGenerics;

public class EmployeeClass {
	String empName = "aaa";
	int  empid = 11;
	EmployeeClass(String name,int id){
		empName=name;
		empid=id;
	}
	 public String toString(){
	        return empid+"  "+empName;
	    }
}
