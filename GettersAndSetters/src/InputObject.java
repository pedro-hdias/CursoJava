import java.util.Scanner;

public class InputObject {

	public static void main(String[] args) {
		String myTime;
		soccer crowd = new soccer();
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Para qual time você torce?");
		myTime = keyboard.next();
		crowd.setTime(myTime);
		crowd.displayTime();
		keyboard.close();
	}

}
