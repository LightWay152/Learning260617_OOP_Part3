package lab.Static;

public class UseMyStatic {

	public static void main(String[] args) {
//		MyStatic.x = 5;
//		MyStatic.staticMethod();
//		
//		MyStatic myStatic = new MyStatic();
//		myStatic.x = 20;
//		myStatic.y = 20;
//		myStatic.staticMethod();
//		
//		MyStatic myStatic2 = new MyStatic();
//		myStatic2.x = 30;
//		myStatic2.y = 30;
//		myStatic2.staticMethod();
//		
//		System.out.println(MyStatic.x);
//		System.out.printf("%d, %d\r\n",myStatic.x,myStatic.y);
//		System.out.printf("%d, %d\r\n",myStatic2.x,myStatic2.y);
		
		MyStatic.x += 5;
		MyStatic.x += 5;
		System.out.println(MyStatic.x);//block static only run one time
			
	}

}
