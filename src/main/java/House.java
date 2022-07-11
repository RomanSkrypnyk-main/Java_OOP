public class House extends Building {

	House() {
		//WE ALWAYS GET CONSTRUCTOR FROM PARENT CLASS
		System.out.println("Child: non-parameter constructor from child class House. (h) ");
	}

	House(String name) {
		/*this();*/// to get non-parameter constructor from House (child) class
		//WE ALWAYS GET CONSTRUCTOR FROM PARENT CLASS
		System.out.println("Child: one parameter constructor from child class B (hn+x) + " + name);
	}

	//static methods are not overridden
	public static void build() {
		System.out.println("Child: Build a House!");
	}

	public void builds(){
		System.out.println("Child non-static: Build House!");
	}

}
