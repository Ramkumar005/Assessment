package assessment_01;

public class School_Grading {

	public static void main(String[] args) {

		int num = 55;

		if (num <= 25) {
			System.out.println("F");
		} else

		if (num <= 45 && num >= 25) {
			System.out.println("E");

		} else

		if (num <= 50 && num >= 45) {
			System.out.println("D");

		} else

		if (num <= 60 && num >= 50) {
			System.out.println("C");

		} else

		if (num <= 80 && num >= 60) {
			System.out.println("B");

		} else {
			System.out.println("A");
		}
	}
}
