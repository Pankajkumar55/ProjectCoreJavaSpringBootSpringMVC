package pack1;

public class Add<T> {

	public Add() {
		// This is a constructor

	}

	public void add(T t) {

	}

	public static void main(String[] args) {

		Add<Integer> add = new Add<>();
		add.add(10);
		add.add(20);

	}

}
