package Exception;

public class ClassNotFound {

	public static void main(String[] args) {
		try {
			Class.forName("classroom.Main12");
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Program Ends");
		}

	}

}
