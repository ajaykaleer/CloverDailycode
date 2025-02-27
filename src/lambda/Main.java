package lambda;

public class Main {
 private static LengthInter lengthInter;

public static void main(String[] arg) {
	 System.out.println("My System start");
	 
	// MyInter  myint=new MyInterImpl();
	//  myint.sayHelloo();
//	 
//	 MyInter i= new MyInter() {
//		
//		@Override
//		public void sayHelloo() {
//    System.out.println("this is anonymous java ")	;		
//		}
//	};
//		 
//		 i.sayHelloo();
//		 
//		 
	 // using 	our interface with the help of lambda
	 
//	 MyInter i= () -> System.out.println("lambda expression"); 
//	 i.sayHelloo();
//	 
//	 MyInter i2= () -> System.out.println(" java programm");
//	 i2.sayHelloo();
	 
	 SumInter sumInter = (a, b)->  a*b;
		 
		
		 System.out.println(sumInter.sum(5,6)) ;
		 System.out.println(sumInter.sum(6,8));
		 
		 LengthInter lengthInt = str ->str.length();
		 System.out.print("Length of the string is " +lengthInter.getLength("Ajay kale"));
		  
			 
			 
		 }
	 
	 
 }
 
 

