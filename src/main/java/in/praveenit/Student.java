package in.praveenit;

public class Student {
	public static void main(String[] args) {
		Student s = new Student();
		s = null;
		System.gc();
		Runtime.getRuntime().gc();
	}
	protected void finalize() throws Throwable {
		System.out.println("Finalize() Called...");
	}

}
