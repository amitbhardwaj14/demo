package Example.ClassnObject;
//Simple Example of Object and Class
public class Student1 {
	int id = 001; //data member also known as instance variable
	String name = "Amit Bhardwaj";  //data member also known as instance variable
		
	public static void main(String[] args) {
		Student1 s1 = new Student1();	//creating an object of class student.
		System.out.println(s1.id);
		System.out.println(s1.name);

	}

}
