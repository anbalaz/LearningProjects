import java.util.Scanner;

public class App_Faktorial {
	public static void main(String[] args) {
		
		FunkciaFaktorial ff= new FunkciaFaktorial();
		Scanner sc= new Scanner(System.in);
		int faktNumb;
		
		do {
		System.out.println("Write number from 1-19 and I'll tell you it's faktorial!");
		faktNumb=sc.nextInt();
		int f= ff.fFaktorial(faktNumb);
		System.out.println(f);
		}while(faktNumb!=0);
		
		
	}

}
