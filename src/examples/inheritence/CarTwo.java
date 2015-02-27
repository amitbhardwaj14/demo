package examples.inheritence;
 class CarTwo extends VehicleTwo {
	int cc;
	int gears;
	String color;
	public static void main(String[] args) {
		CarTwo car2 = new CarTwo();
		car2.color = "Blue";
		car2.setSpeed(200);
		car2.setSize(22);
		car2.cc = 1000;
		car2.gears = 5;
		
		System.out.println("Color of a car : "+car2.color);
		System.out.println("Speed of a car : "+car2.getSpeed());
		System.out.println("Size of a car : "+car2.getSize());
		System.out.println("CC of a car : "+car2.cc);
		System.out.println("Gears in a car : "+car2.gears);

	}

}
