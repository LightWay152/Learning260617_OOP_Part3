package lab.Utilities;

public class XMath {
	public static Number min(Number...args){
		Number min = args[0];
		for(Number n : args){
			if(min.doubleValue() > n.doubleValue()){
				min = n;
			}
		}
		return min;
	}
}
