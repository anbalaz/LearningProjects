
public class Function {
	public int FunctionFactorial(int i) {

		int f = 1;
		for (int e = i; e > 0; e--) {
			f = f * e;
		}
		return f;
	}
	
	public int FunctionModulo(int i) {
		int f=0;
		
		for (int e=0;e<=i;e++) {
			if((e% 3)==0){
				if((e% 6)==0) {
					System.out.println(e);
				}
			}
		}
		return f;
	}

}
