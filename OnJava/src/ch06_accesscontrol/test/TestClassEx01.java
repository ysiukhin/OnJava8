package ch06_accesscontrol.test;

public class Vector {
//	enum PaperCurranciesValues { ONE, TWO, FIVE, TEN, TWENTY, FIFTY };
	void print(String ... strs) {
		for (String str : strs) {
			System.out.print(str);
		}
		System.out.println();
	}
	public TestClassEx01() {
		System.out.println("ch06_accesscontrol.test.Vector");
	}
}