package ArrayListGenerics;

public class StudentClass {
	private String StdName ;
	private int StdId;
	StudentClass(String name, int id){
		this.StdName=name;
		this.StdId=id;
	}
	public void get() {
		System.out.println(StdName+""+StdId);
	}
	public String toString(){
        return StdName+"  "+StdId;
    }
}
