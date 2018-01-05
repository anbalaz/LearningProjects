import java.util.Scanner;

public class App_Faktorial {
	public static void main(String[] args) {
		
		Function function1= new Function();
		Scanner sc= new Scanner(System.in);
		int numb;
		
		
	/*	do {
		System.out.println("Write number from 1-19 and I'll tell you it's faktorial!");
		
		numb=sc.nextInt();
		
		int f= function1.FunctionFactorial(numb);
		
		System.out.println(f);
		
		}while(numb!=0);*/
		
		numb=sc.nextInt();
		int f= function1.FunctionModulo(numb);
		System.out.println(f);
		
	}

}
