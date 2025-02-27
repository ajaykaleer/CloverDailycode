package lambda;

import java.util.function.BiFunction;

public class LambdaAddition {
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> add =(a,b) -> a+b;
		System.out.println("output=" +add.apply(5,3));
		
		BiFunction<Integer,Integer,Integer> sub =(a,b)-> a-b;
		System.out.println("Subtraction" + sub.apply(10,5));
		
		BiFunction<Integer,Integer,Integer> mul =(a,b)->a*b;
		System.out.println("multiply" +mul.apply(10,8));
		
		
		
		
		
		
	}
	

}
