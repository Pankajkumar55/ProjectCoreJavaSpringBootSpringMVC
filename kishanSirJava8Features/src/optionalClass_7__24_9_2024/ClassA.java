package optionalClass_7__24_9_2024;

import java.util.Optional;

public class ClassA {
	public static void main(String[] args) {
		new ClassA().meth1();
	}

	void meth1() {
		String arr[] = new String[5];
		arr[0] = "pankaj";
		arr[2] = "kishan Sir";

//		 System.out.println(arr[3].toUpperCase());

		/*	
		 
		  Optional<String> o = Optional.ofNullable(arr[1]);
			System.out.println(o);
			if (o.isPresent()) {
				System.out.println("data is present");
				System.out.println(o.get());
			} else {
				System.out.println("its empty");
			}
			
			*/

		System.out.println("==========================================");

		for (int i = 0; i <= arr.length - 1; i++) {
			Optional<String> o1 = Optional.ofNullable(arr[i]);
			if (o1.isPresent()) {
				System.out.println((o1.get()).toUpperCase());

			} else {
				System.out.println("it is Null value we can't perform any acation");
			}

		}
	}
}