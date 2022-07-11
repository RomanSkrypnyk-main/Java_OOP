public class Building {

	//WE ALWAYS GET CONSTRUCTOR FROM PARENT CLASS
	Building() {
		System.out.println("Parent: non-parameter constructor from Parent class Building. (b) ");
	}

	Building(String name) {
		//this(); // to get non-parameter constructor from Building (parent) class; NOT necessary
		System.out.println("Parent: one parameter constructor from Parent class Building (bn+x) + " + name);
	}

	//static methods are not overridden
	public static void build() {
		System.out.println("Parent static: Build anything!");
	}

	public void builds() {
		System.out.println("Parent non-static: Build anything!");
	}

}
