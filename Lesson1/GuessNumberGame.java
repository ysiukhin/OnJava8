public class GuessNumberGame {
	public static void main(String[] args) {
		int computerNumber = 60;
		int myNumber = 45;

		while(true) {
			System.out.print("My number is - " + myNumber);
			if (computerNumber == myNumber)
				break;

			if (computerNumber > myNumber){
				System.out.println(" your number less than Computer think");
				myNumber++;
			}
			if (computerNumber < myNumber){
				System.out.println(" your number bigger than Computer think");
				myNumber--;
			}
		}
		System.out.println(" WOW, congratulations !!!\n You win, this is correct mumber");
	}
}