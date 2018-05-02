package Github;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Course c = new Course("SWER142", "Object Oriented Prog", null);
		ArrayList<Double> arr = new ArrayList<>();
		System.out.println(" enter a number");

		double i;
		do {

			i = input.nextInt();
			arr.add(i);
		} while (i != 0);
	}

	public static double max(ArrayList<Double> list) {
		if (list.size() == 0)
			return (Double) null;
		Double max = list.get(0);

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) > max) {
				max = list.get(i);
			}
		}
		return max;

	}

}
