
public class Function {
	public int FunctionFactorial(int i) {

		int f = 1;
		for (int e = i; e > 0; e--) {
			f = f * e;
		}
		return f;
	}

}
