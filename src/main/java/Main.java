public class Main {

	public static void main(String[] args) {
		//parent
		System.out.println("PARENT:");
		Building building = new Building("param Building");//bn+x
		new Building();//b
		building.build();

		//child
		System.out.println("CHILD:");
		new House("param House.");//b hn+x
		new House();//b + h

		System.out.println("--------------");

		Building building1 = new Building("anything.");
		building1.build(); //static method 
		building1.builds();

		Building building2 = new House("house.");
		building2.build();
		building2.builds();
	}

}
