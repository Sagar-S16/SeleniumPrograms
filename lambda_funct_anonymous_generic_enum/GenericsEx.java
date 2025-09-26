package lambda_funct_anonymous_generic_enum;

import java.util.ArrayList;
import java.util.List;

public class GenericsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		for(String name :  names) {
			System.out.println(name);
		}

	}

}
