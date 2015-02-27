package Example.ClassnObject;
//Another Example of Object and Class
//There is given another example that maintains the records of Rectangle class. Its explanation is same as in the above Student class example.
public class Rectangle {
	int length;
	int width;
	
	void insert(int l, int w){
		length = l;
		width = w;
			}
	void calculateArea(){
		System.out.println(length*width);
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		r1.insert(15, 10);
		r1.calculateArea();
		
		r2.insert(10, 5);
		r2.calculateArea();
	}

}
