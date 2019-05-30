package ArrayListGenerics;
import java.util.*;
public class MainArrayList {
	public static void main(String args[]) {
		ArrayList<EmployeeClass> al=new ArrayList<>();
		System.out.println("enter the number of objects");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("enter the name");
			String name=sc.next();
			System.out.println("enter the number");
			int id=sc.nextInt();
			al.add(new EmployeeClass(name,id));
		}
		System.out.println(al);
		ArrayList<StudentClass> Sll=new ArrayList<>();
		Sll.add(new StudentClass("jaya",31));
		Sll.add(new StudentClass("teju",22));
		System.out.println(Sll);
		/*for (StudentClass studentClass : Sll) {
			studentClass.get();
		}*/
		/*for(EmployeeClass emp:al) {
			System.out.println(emp.empName+" "+emp.empid);
			
		}
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}*/
		al.add(new EmployeeChild("zzz",999));
		/*System.out.println(al);
			sc.close();*/
		LinkedList<ArrayList> ll = new LinkedList<>();
		ll.add(al);
		//System.out.println(ll);
		ll.add(Sll);
		System.out.println(ll);
		/*for (ArrayList arrayList : ll) {
			for(int i=0;i<arrayList.size();i++) {
				System.out.println(arrayList.get(i));
			}
		}**/
	}
}
