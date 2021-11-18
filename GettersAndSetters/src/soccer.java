
public class soccer {
	private String nameTeam;

	public void setTime(String myTime) {
		nameTeam = myTime;
	}

	public String getTime() {
		return nameTeam;
	}

	public void displayTime() {
		System.out.println("O seu time é: " + getTime())
	}
}
