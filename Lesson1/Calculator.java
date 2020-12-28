public class Calculator {
	public static void main(String[] args) {		
		
		int value1 = 6; // First operand  
		int value2 = 3; // Second operand
		char mathOperation = '+'; // Math operation from the list ( + - * / % ^ )
		int result = 0; // Calculated result

		if (mathOperation == '+') {
			result = value1 + value2;
		}

		if (mathOperation == '-') {
			result = value1 - value2;
		}

		if (mathOperation == '*') {
			result = value1 * value2;
		}

		if (mathOperation == '/') {
			result = value1 / value2;
		}

		if (mathOperation == '%') {
			result = value1 % value2;
		}

		if (mathOperation == '^') {
			result = 1;
			if (value2 > 0){
				for(int i=1; i<=value2; i++) {
					result = result * value1;
				}
			}
		}
		System.out.println("Calculated result of expretion " + value1 +" "+mathOperation+" " + value2 + " = " + result);
	}
}