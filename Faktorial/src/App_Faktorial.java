import java.util.Scanner;

public class App_Faktorial {
	public static void main(String[] args) {

		TextFields texts = new TextFields();

		Function function1 = new Function();

		Scanner sc = new Scanner(System.in);
		int numb;

		
		String answer;

		do {

			System.out.println(texts.Function);

			answer = sc.nextLine();

			if (answer.equals("faktorial")) {

				do {
					System.out.println(texts.Faktorial);

					numb = sc.nextInt();

					int f = function1.FunctionFactorial(numb);

					System.out.println(f);
				} while (numb != -1);

			}

			if (answer.equals("modulo1")) {
				do {
					System.out.println(texts.Modulo1);
					numb = sc.nextInt();
					int b = function1.FunctionModulo1(numb);
				} while (numb != -1);

			}

			if (answer.equals("modulo2")) {
				do {
					System.out.println(texts.Modulo2);
					numb = sc.nextInt();
					function1.FunctionModulo2(numb);
				} while (numb != -1);

			}

		} while (!answer.equals("exit"));
	}
}
