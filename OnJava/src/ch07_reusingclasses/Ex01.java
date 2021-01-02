package ch07_reusingclasses;

class Simple {
	String s;
	public Simple(String s) { this.s = s; }
	public String toString() { return s; }
	public void setString(String s) { this.s = s; }
}

class Second {
	Simple simple;
	String s;
	public Second (String s) { this.s = s; }

	public void check() {
		if (simple == null)
			System.out.println("not initialized");
		else
			System.out.println("initialized");
	}

	private Simple lazy() {
		if(simple == null) {
			System.out.println("Creating Simple");
			simple = new Simple(s);
		}
		return simple;
	}

	public Simple getSimple() { return lazy(); }
	public void setSimple(String s) { lazy().setString(s); }

	public String toString() { return lazy().toString(); }
}

public class Ex01 {	

	public static void main(String ... args) {	
		System.out.println("\n------------- Inside main() ----------------\n");
		Second second = new Second("Init string");
		second.check();
		System.out.println(second.getSimple());
		second.check();
		System.out.println(second);
		second.setSimple("New string");
		System.out.println(second);
		System.out.println("\n------------- End of main ----------------\n");
		
	}
}