package lab.Utilities;

public class UseKeyboard {

	public static void main(String[] args) {
		String fullName = Keyboard.readLine("Full name: ");
		int age = Keyboard.readInt("Age: ");
		double mark = Keyboard.readDouble("Mark: ");
		
		System.out.println();
		System.out.println(fullName);
		System.out.println(age);
		System.out.println(mark);
	}

}
