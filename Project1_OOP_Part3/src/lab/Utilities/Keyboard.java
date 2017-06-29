package lab.Utilities;

import java.util.Scanner;

public class Keyboard {
	static Scanner scanner = new Scanner(System.in);
	/**
	 * Read a line from keyboard
	 * @param message is remind string
	 * @return line is a string which read from keyboard
	 * */
	public static String readLine(String message){
		System.out.print(message);
		String line = scanner.nextLine();
		return line;
	}
	
	/**
	 * Read a integer number from keyboard
	 * @param message is remind string
	 * @return number is a integer number which read from keyboard*/
	public static int readInt(String message){
		System.out.print(message);
		int number = scanner.nextInt();
		scanner.nextLine();
		return number;
	}
	
	/**
	 * Read a double number from keyboard
	 * @param message is remind string
	 * @return number is a double number which read from keyboard*/
	public static double readDouble(String message){
		System.out.print(message);
		double number = scanner.nextDouble();
		scanner.nextLine();
		return number;
	}
}
