import java.util.ArrayList;
import java.util.Iterator;

public class ClassA {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(1);
		al.add(3);
		al.add(5);
		al.add(10);

		Iterator iterator = al.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
