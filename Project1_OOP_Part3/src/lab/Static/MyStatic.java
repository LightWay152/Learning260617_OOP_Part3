package lab.Static;

public class MyStatic {
	public static int x;//not depend on object
	public int y;//depend on object
	public static void staticMethod(){
		MyStatic.x=5;
		//y=6;//error because y doesn't static variable
	}
	
	public void method2(){
		/*No error because this class doesn't static*/
		MyStatic.x=5;
		y=6;
	}
	
	static{
		/*Remember: in static block only use static variables*/
		MyStatic.x=5;
		//y=6;//error because y doesn't static variable
	}
}
