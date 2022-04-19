package week1.day2.assignments;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		int addThreeNumbers = cal.addThreeNumbers(1, 10, 5);
		System.out.println(addThreeNumbers);

		int subTwoNumbers = cal.subTwoNumbers(100, 25);
		System.out.println(subTwoNumbers);

		double mulTwoNumbers = cal.mulTwoNumbers(500, 250);
		System.out.println(mulTwoNumbers);

		float divTwoNumbers = cal.divTwoNumbers(50, 25);
		System.out.println(divTwoNumbers);

	}

}
