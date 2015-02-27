package Example.ClassnObject;
//Example of Object and class that maintains the records of students

public class Student2 {
	int rollno;
	String name;
	
	void insertRecord(int r, String n){
		rollno = r;
		name = n;
	}
	
	void displayInformation(){
		System.out.println(rollno+"   "+name);
	}
	
	public static void main(String[] args) {
		Student2 s2 = new Student2();
		
		s2.insertRecord(1, "Amit Bhardwaj");
		s2.displayInformation();
		
		s2.insertRecord(2, "Pooja Bhardwaj");
		s2.displayInformation();
		
		s2.insertRecord(3, "Monika Bhardwaj");
		s2.displayInformation();

	}

}
