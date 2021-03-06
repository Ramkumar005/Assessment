package assessment_01;

public class Day_Name {

	public String monday() {
		String Day1 = "weekday";
		System.out.println(Day1);
		return Day1;
	}

	public String tuesday() {
		String Day2 = "weekday";
		System.out.println(Day2);
		return Day2;
	}

	public String wednessday() {
		String Day3 = "weekday";
		System.out.println(Day3);
		return Day3;
	}

	public String sunday() {
		String Day4 = "weekend";
		System.out.println(Day4);
		return Day4;
	}

	public static void main(String[] args) {

		Day_Name obj = new Day_Name();
		obj.wednessday();
	}

}
