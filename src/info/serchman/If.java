package info.serchman;

public class If {

	public static void main(String[] args) {
		int time = 19;
		System.out.println("Now: "+time+":00");
		if((time > 6) && (time <= 12)) { 
			System.out.println("Good morning");
		}else if((time > 12) && (time < 18)) {
			System.out.println("Good afternoon");
		}else {
			System.out.println("Good evening");
		}
	}

}
