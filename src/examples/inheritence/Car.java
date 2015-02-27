package examples.inheritence;

public class Car extends Vehicle{
	int cc;
	int gears;
	public void carAttributes(){
		System.out.println("Color of car is : " +color);
		System.out.println("Speed of car is : " +speed);
		System.out.println("Size of car is : " +size);
		System.out.println("CC of car is : " +cc);
		System.out.println("Gears in car : " +gears);
	}
	public static void main(String[] args) {
		Car car = new Car();
		car.color = "Blue";
		car.speed = 200;
		car.size = 22;
		car.cc = 1000;
		car.gears = 5;
		//car.attributes();
		car.carAttributes();

	}

}
