import java.util.ArrayList;
import java.util.List;

public class Testing {
	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();

		values.add(5);
		values.add(7);
		values.add(2);
		values.add(1);
		values.add(23);
		
		lastValue(values);
		
		System.out.println(values.get(values.size()-1));
		
		
	}
	
	private static void lastValue(List<Integer>list) {
		list.add(5);
		list.add(3);
		list.add(2);
		list.add(9);
		list.add(3,17);
		
		for(int i=0;i<50;i++) {
			list.add(0,i);
			System.out.println("You added to index 0 value: " + i);
			System.out.println("You are getting the value at: " + i);
			System.out.println(list.get(i));
			System.out.println("---------------");
			}
		
	}

}
