import java.util.Scanner;

public class GradeCalculater {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int math, phys, chem, turk, hist, music;
		sc = new Scanner(System.in);
		
		System.out.println("Welcome to avarage calculate program!!");
		System.out.print("Please imput math grade:");
		math=sc.nextInt();
		
		System.out.print("Please imput physic grade:");
		phys=sc.nextInt();
		
		System.out.print("Please imput chemistry grade:");
		chem=sc.nextInt();
		
		System.out.print("Please imput turkish grade:");
		turk=sc.nextInt();
		
		System.out.print("Please imput history grade:");
		hist=sc.nextInt();
		
		System.out.print("Please imput music grade:");
		music=sc.nextInt();
		
		int sum= (math+phys+chem+turk+hist+music);
		double avg=sum/6;
		
		System.out.println("The average is: "+ avg + "\nvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
		String pof=(avg>=60 ) ? "Passed!!!" : "Failed" ;
		System.out.println(pof);

	}

}
